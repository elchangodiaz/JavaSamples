package test;

import ejemploinstanceof.Empleado;
import ejemploinstanceof.Gerente;

public class EjemploInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        determinaTipo(empleado);

        Gerente gerente = new Gerente("Karlla", 2000, "Finanzas");
        determinaTipo(gerente);

    }
//primero la menor gerarquia de clases para poder acceder, sino la de mayor jerarquia predominara
    public static void determinaTipo(Empleado empleado) {
        if(empleado instanceof Gerente){
            Gerente gerente = (Gerente) empleado;
            System.out.println("Departamento del gerente = " + gerente.getDepartamento());
            //System.out.println("gerente = " + ((Gerente) empleado).getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Nombre empleado = " + empleado.getNombre());
        }
    }
}
