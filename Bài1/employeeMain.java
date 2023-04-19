package Tuan1.Bài1;

import Tuan1.Bài1.Employee;

public class employeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        employee = new Employee("Trần Quốc Chung", true, 26, "NASA");
        System.out.println(employee);

        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }

}
