package test;

import dominio.Empleado;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 1000);
        //System.out.println("emp1 = " + emp1);
        Empleado emp2 = new Empleado("Juan", 1000);
        //System.out.println("emp2 = " + emp2);

        /*
        System.out.println("objetos iguales: " + (emp1 == emp2));
        
        System.out.println("Direccion de memoria emp1 " + VM.current().addressOf(emp1));
        System.out.println("Direccion de memoria emp2 " + VM.current().addressOf(emp2));
        
        System.out.println("Detalle emp1: " + GraphLayout.parseInstance(emp1).toPrintable());
        System.out.println("Detalle emp2: " + GraphLayout.parseInstance(emp2).toPrintable());
         */
        comparaObjetos(emp1, emp2);

    }

    private static void comparaObjetos(Empleado emp1, Empleado emp2) {
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);

        //revision por referencia
        if (emp1 == emp2) {
            System.out.println("los objetos tienen la misma referencia en memoria");
        } else {
            System.out.println("Los objetos tienen distinta referencia en memoria");
        }

        //revision del metodo equals
        if (emp1.equals(emp2)) {
            System.out.println("Los objetos tienen el mismo contenido");
        } else {
            System.out.println("Los objetos no tienen el mismo contenido");
        }

        //revisamos el metodo hashCode
        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash");
            System.out.println("emp1 hash = " + emp1.hashCode());
            System.out.println("emp2 hash = " + emp2.hashCode());

        } else {
            System.out.println("Los objetos no tienen el mismo codigo hash");
        }

    }

}
