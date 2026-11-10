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

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;
        }

        public Double getSalary() {
            return salary;
        }
    }


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        loadData(employees);
        employees.forEach(System.out::println);

        //Second highest Salary
        System.out.println("\nSecond highest Salary");
        Optional<Employee> employee = employees.stream().sorted( (e1,e2) ->
                (int) (e2.salary - e1.salary)).skip(1).findFirst();
        System.out.println("Second highest Salary" +employee);

        //Sum of salary by dept
        //Map for output
        System.out.println("\nSum of salary by dept");
        Map<String , Double> sumSalaryEachDept = employees.stream().
                collect(Collectors.groupingBy(e -> e.dept, Collectors.summingDouble(
                        Employee::getSalary)
                ));
        sumSalaryEachDept.forEach((k,v) -> System.out.println(k + " " + v));

        //Highest salary in each Dept
        System.out.println("\nHighest salary in each Dept");
        Map<String, Optional<Employee>> highestSalaryByDept = employees.stream().
                collect(Collectors.groupingBy(e -> e.dept, Collectors.maxBy(
                        Comparator.comparingDouble(Employee::getSalary)
                )));
        highestSalaryByDept.forEach((k,v) -> System.out.println(k + " " + v));


        //Get list of employee by dept
        System.out.println("\nGet list of employee by dept");
        Map<String , List<Employee>> employeeByEachDept = employees.stream().
                collect(Collectors.groupingBy(e -> e.dept));
        employeeByEachDept.forEach((k,v)->{
            System.out.println("---" + k + " ---");
            v.forEach(System.out::println);
        });

        //Sort by salary
        System.out.println("\nSort by Salary");
        List<Employee> sortedBySalary =
                employees.stream().filter(c -> !c.dept.equals("dept01")).sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
        sortedBySalary.forEach(System.out::println);

        //Max and Min Salary
        System.out.println("\nmax and min Salary");
        Optional<Employee> maxSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> minSalary = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println( maxSalary + " -- "+ minSalary);

        //Sort by salary
        System.out.println("\nTop3 Sort by Salary");
        List<Employee> top3SortedBySalary =
                employees.stream().filter(c -> !c.dept.equals("dept01")).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                        limit(3).toList();
        top3SortedBySalary.forEach(System.out::println);

        //Nth highest Salary
        System.out.println("\nNth highest Salary");
        int nthHighest = 2;
        Optional<Double> nthLargest = employees.stream().
                sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                skip(nthHighest - 1).findFirst().map(Employee::getSalary);
        System.out.println(nthHighest + " -- "+ nthLargest);

        //

    }


    private static void loadData(List<Employee> input){

        for (int i = 0; i< 12; i++){
            Employee employee = new Employee(100+ i, "employee_"+i, "dept"+ i%3+1, 100 + i*2);
            input.add(employee);
        }

    }


}
