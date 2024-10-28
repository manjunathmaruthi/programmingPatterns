package com.manjunath.dotikol;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("A");
        Employee e2 = new Employee("B");
        Map<Employee, Integer> map = new HashMap<>();
        map.put(e1,12);
        map.put(e2,12);
        System.out.println(map.get(e2));
    }
}

class Employee {
    String name;

    public Employee(String name) {
        this.name =name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(2);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                '}';
    }
}
