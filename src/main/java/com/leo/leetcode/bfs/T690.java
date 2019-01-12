package com.leo.leetcode.bfs;

import com.leo.leetcode.builtin.Employee;

import java.util.*;

/**
 * 690. 员工的重要性
 * https://leetcode-cn.com/problems/employee-importance/description/
 */
public class T690 {

    public int getImportance(List<Employee> employees, int id) {
        if (employees == null || employees.isEmpty()) return 0;
        Map<Integer, Employee> map = new HashMap<>();
        Queue<Employee> queue = new LinkedList<>();
        for (Employee item : employees) {
            map.put(
                    item.id,
                    item
            );
        }
        if (!map.containsKey(id)) return 0;
        Employee employee = map.get(id);
        if (employee.subordinates == null || employee.subordinates.isEmpty()) return employee.importance;
        queue.offer(employee);
        int result = 0;
        while (!queue.isEmpty()) {
            Employee item = queue.poll();
            result += item.importance;
            if (item.subordinates != null) {
                for (Integer sub : item.subordinates) {
                    if (!map.containsKey(sub)) continue;
                    queue.offer(map.get(sub));
                }
            }
        }
        return result;
    }


}
