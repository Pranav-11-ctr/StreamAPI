package streamConcept.goodStreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1
{
    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    String name;
    String department;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
public class EmployeeGrouping {
    public static void main(String[] args) {

        List<Employee1> list=Arrays.asList(new Employee1("John", "HR"),
        new Employee1("Jane", "IT"),
                new Employee1("Doe", "HR"));
        Map<String, List<Employee1>> collect = list.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment));

        System.out.println(collect);


    }
}
