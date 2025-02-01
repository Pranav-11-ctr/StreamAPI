package streamConcept.goodStreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

class Employee
{
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
//filter out employees who are older than 30 and have a salary greater than 50000.
public class EmployeeFilteringUsingStreamAPI {

    public static void main(String[] args) {

        List<Employee> list=Arrays.asList(new Employee("John", 35, 60000),
                new Employee("Jane", 28, 55000),
                new Employee("Doe", 40, 70000));

        list.stream()
                .filter(emp->emp.salary>50000 && emp.age>30)
                .forEach(emp-> System.out.println(emp.name+" "+emp.age+" "+emp.salary));
    }



}
