package ejemplosobreescritura;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobreescribimos el metodo heredado del padre
    @Override
    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo + "Departamento: "
                + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
