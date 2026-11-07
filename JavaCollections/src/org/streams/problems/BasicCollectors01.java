package org.streams.problems;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.*;
import java.util.stream.Collectors;

public class BasicCollectors01 {


    static class Employee{
       public long id;
       public String name;
       public String dept;
       public Double salary;

        public Employee(long id, String name, String dept, double salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return " id "+ this.id + " Name "+ this.name + " Dept "+ this.dept + " Salary " + this.salary;
        }
    }


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        loadData(employees);
        employees.forEach(System.out::println);

        //Second highest Salary
        Optional<Employee> employee = employees.stream().sorted( (e1,e2) ->
                (int) (e2.salary - e1.salary)).skip(1).findFirst();
        System.out.println("Second highest Salary" +employee);

        //Count of Emp in Each dept
        //Map for output
        Map<String , Long> highestSalaryEachDept = employees.stream().
                collect(Collectors.groupingBy(e -> e.dept), Collectors.summingDouble(
                        e ->
                ));
        


        //Get list of employee by dept
        Map<String , List<Employee>> employeeByEachDept = employees.stream().
                collect(Collectors.groupingBy(e -> e.dept));
        employeeByEachDept.forEach((k,v)->{
            System.out.println("---" + k + " ---");
            v.forEach(System.out::println);
        });

    }


    private static void loadData(List<Employee> input){

        for (int i = 0; i< 12; i++){
            Employee employee = new Employee(100+ i, "employee_"+i, "dept"+ i%3+1, 100 + i*2);
            input.add(employee);
        }

    }


}
