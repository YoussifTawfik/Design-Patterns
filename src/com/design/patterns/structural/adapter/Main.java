package com.design.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Youssif Tawfik");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Cairo, Egypt");
    }
}
