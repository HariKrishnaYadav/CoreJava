package bin.com.hky.designPattern.singleton;

import com.hky.java8code.Employee;

public class EmployeeThreadSafe {
    private static EmployeeThreadSafe employee;
    private EmployeeThreadSafe(){

    }

    public static synchronized EmployeeThreadSafe getInstance(){
        if(employee==null){
            synchronized (EmployeeThreadSafe.class){
                if (employee==null){
                    employee=new EmployeeThreadSafe();
                }
            }

        }
        return employee;
    }
}
