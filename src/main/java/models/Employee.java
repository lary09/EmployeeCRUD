package models;

public class Employee {
    private int id;
    private String nombre;
    private String apellido;
    private double salario;

    public Employee() {}

    public Employee(int id, String nombre, String apellido, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }
    public  void setId(){this.id = id;}

    public String getNombre() {
        return nombre;
    }

    public void  setNombre() {
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(){
        this.apellido = apellido;
    }
    public double getSalario(){
        return  salario;
    }
    public void setSalario(){
        this.salario =salario;
    }
}
