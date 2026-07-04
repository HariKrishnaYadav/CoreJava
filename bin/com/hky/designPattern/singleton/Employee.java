package bin.com.hky.designPattern.singleton;

public class Employee {
    private static Employee employee;
    private Employee(){

    }

    public static Employee getInstance(){
        if(employee==null){
            employee=new Employee();
        }
        return employee;
    }
}
