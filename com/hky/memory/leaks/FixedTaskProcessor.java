package com.hky.memory.leaks;

import java.util.ArrayList;
import java.util.List;

/**
 * Fixed Version of Memory Leak Example
 */
public class FixedTaskProcessor {

    public void executionPipeline() {

        /*
         * FIX 1:
         * Keep the collection local to the method.
         * Once the method completes, the list becomes eligible for GC.
         */
        List<TaskDetails> temporaryLog = new ArrayList<>();

        // Simulate processing 10 lakh tasks
        for (int i = 0; i < 1_000_000; i++) {

            /*
             * Create heavy object (100 KB payload)
             */
            TaskDetails details = new TaskDetails(
                    "ID-" + i,
                    new byte[1024 * 100]
            );

            /*
             * Execute business logic
             */
            details.executeTask();

            /*
             * Store temporarily
             */
            temporaryLog.add(details);

            /*
             * FIX 2:
             * Flush data periodically instead of keeping everything in memory.
             */
            if (temporaryLog.size() >= 1000) {

                // Persist logs externally
                saveLogsToDatabase(temporaryLog);

                /*
                 * IMPORTANT:
                 * clear() removes object references from the list.
                 * Now GC can reclaim Heap memory.
                 */
                temporaryLog.clear();
            }
        }

        /*
         * Handle remaining records
         */
        if (!temporaryLog.isEmpty()) {
            saveLogsToDatabase(temporaryLog);
            temporaryLog.clear();
        }
    }

    /**
     * Simulated persistence layer
     */
    private void saveLogsToDatabase(List<TaskDetails> logs) {

        // Example: Batch insert into DB / write to file / Kafka / cloud storage
        System.out.println("Saving " + logs.size() + " logs to database...");
    }
}

/**
 * Heavy Object Class
 */
class FixedTaskDetails {

    private String taskId;

    // Large memory-consuming field
    private byte[] memoryPayload;

    public FixedTaskDetails(String taskId, byte[] payload) {
        this.taskId = taskId;
        this.memoryPayload = payload;
    }

    public void executeTask() {

        // Simulated business logic
        System.out.println("Processing Task : " + taskId);
    }
}