package manejojavabeans;

import beans.PersonaBean;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(40);
        
        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
        
        PersonaBean bean2 = new PersonaBean();
        bean2.setNombre("Karla");
        bean2.setEdad(18);
        
        System.out.println("Nombre: " + bean2);
    }
}
