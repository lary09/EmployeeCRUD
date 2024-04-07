package controllers;

import jakarta.servlet.annotation.WebServlet;
import services.EmployeeService;

@WebServlet("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
}
