package com.hky.memory.leaks;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of a Memory Leak in Java
 */
public class TaskProcessor {

    /*
     * PROBLEM:
     * Static collections remain in memory for the entire JVM lifecycle.
     * Every object added here stays in Heap memory unless explicitly removed.
     */
    private static final List<TaskDetails> processedTasksLog = new ArrayList<>();

    public void executionPipeline() {

        // Simulate processing 10 lakh tasks
        for (int i = 0; i < 1_000_000; i++) {

            /*
             * Step 1:
             * Create a heavy object containing 100 KB payload
             */
            TaskDetails details = new TaskDetails(
                    "ID-" + i,
                    new byte[1024 * 100]   // 100 KB data
            );

            /*
             * Step 2:
             * Execute business logic
             */
            details.executeTask();

            /*
             * Step 3: MEMORY LEAK
             *
             * Objects are continuously added to a static list.
             * Since the list is static, GC cannot remove these objects.
             *
             * Result:
             * Heap memory keeps increasing
             * Eventually causes OutOfMemoryError
             */
            processedTasksLog.add(details);
        }
    }
}

/**
 * Heavy Object Class
 */
class TaskDetails {

    private String taskId;

    // Large memory-consuming field
    private byte[] memoryPayload;

    public TaskDetails(String taskId, byte[] payload) {
        this.taskId = taskId;
        this.memoryPayload = payload;
    }

    public void executeTask() {

        // Simulated business logic
        System.out.println("Processing Task : " + taskId);
    }
}

//Why this leaks memory:Even though the loop finishes and the individual details variable goes out of scope, the objects inside the processedTasksLog list cannot be cleaned up. The static list holds a strong reference to every single TaskDetails object. The Garbage Collector (GC) assumes you still need this data, causing the heap memory to climb until the application crashes with a java.lang.OutOfMemoryError.
