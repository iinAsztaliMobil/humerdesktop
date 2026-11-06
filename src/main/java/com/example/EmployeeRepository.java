package com.example;

import java.util.List;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class EmployeeRepository implements Repository {

    String host = "http://localhost:8000/api/employees";

    @Override
    public List<Employee> readEmployee() {
        
        String url = host;
        
        ResClient client = new ResClient();
        String result = client.get(url);

        EmployeeResult res = ResConvert.toObject(result, EmployeeResult.class);

        return res.data;
    }

    @Override
    public Employee createEmployee(Employee emp) {
        return null;
    }
    
}
