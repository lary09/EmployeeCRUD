package services;

import models.Employee;
import models.EmployeeDAO;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {


    private EmployeeDAO employeeDAO;

    public EmployeeService() {
        this.employeeDAO = new EmployeeDAO();
    }
    public Employee getEmployeeById(int id) throws SQLException{
        return employeeDAO.getEmployeeById( id);
    }
    public void insertEmployee(Employee employee) throws  SQLException{
         employeeDAO.insertEmployee(employee);
    }

    public List<Employee> getAllEmployee() throws SQLException {
        return employeeDAO.getAllEmployee();
    }
    public boolean updateEmployee(Employee employee) throws SQLException {
        return employeeDAO.updateEmployee(employee);
    }

    public boolean deleteEmployee(int id) throws SQLException{
        return  employeeDAO.deleteEmployee(id);
    }
}
