package models;

public class Empleado {
    private int dni;
    private String name;
    private String lastName;
    private double salario;


    public Empleado() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(int dni, String name, String lastName, double salario) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.salario = salario;
    }

    public double salarioAnual(){

        double salAnual = this.salario*12;
        return salAnual;
    }

    public double salPorPorcentaje(double porcentaje){
        double salFinal = this.salario + (this.salario*porcentaje);
        return salFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI =" + dni +
                ", NOMBRE ='" + name + '\'' +
                ", APELLIDO ='" + lastName + '\'' +
                ", SALARIO =" + salario +
                '}';
    }
}
