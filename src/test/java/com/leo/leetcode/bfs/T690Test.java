package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T690Test {

    @Test
    public void getImportance() {
        T690 t690 = new T690();
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.id = 1;
        employee.importance = 5;
        employee.subordinates = Arrays.asList(2, 3);
        employees.add(employee);
        employee = new Employee();
        employee.id = 2;
        employee.importance = 3;
        employees.add(employee);
        employee = new Employee();
        employee.id = 3;
        employee.importance = 3;
        employees.add(employee);
        Assert.assertEquals(
                11,
                t690.getImportance(employees, 1)
        );
    }
}