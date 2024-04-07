import models.Employee;
import models.EmployeeDAO;

public class App {
    public static void main(String [] args){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employeeNuevo = new Employee(4,"Ricardo","Ortiz", 30000);


        try {
            employeeDAO.updateEmployee(employeeNuevo);
            System.out.println("Empleado actualizado correctamente");
        } catch (Exception e) {
            System.out.println("Error al actualizar un empleado" + e.getMessage());
        }
    }
}
