package FactoryDesignPattern;

public class AndroidDeveloper implements Employee {

    static {
        EmployeeFactory.register("AndroidDeveloper", AndroidDeveloper::new);
        System.out.println(EmployeeFactory.employeeMap);
    }

    @Override
    public int salary() {
        return 2000;
    }
}
