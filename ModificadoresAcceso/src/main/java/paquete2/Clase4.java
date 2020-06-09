package paquete2;

import paquete1.Clase1;

public class Clase4 {
    public Clase4(){
       //Prueba de constructores de la clase 1
        new Clase1(); //llamada al constructor publico
        //new Clase1("uno", "dos"); //llamada constructor protected
        //no podemos llamar al constructor protected
        //new Clase1("uno", "dos", "tres"); //llamada al constructor default o package
        //no podemos llamar al constructor default
        //new Clase1("uno", "dos", "tres", "cuatro"); //llamada constructor privado 
        //constructores privados no pueden ser llamados desde otras clases, sin importar si es el mismo paquete

    }
    
        public void prueebaDesdeClase4() {
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("atrubuto publico " + c1.atributoPublico);
        //System.out.println("atrubuto protegido " + atributoProtegido);
        //podemos acceder a protected sin accder direrc a la referencia del objeto c1.
        //System.out.println("atributo default " + c1.atributoDefault);
        //System.out.println("atrubuto privado " + c1.atributoPrivate);

        System.out.println("");

        System.out.println("metodo publico " + c1.metodoPublico());
        //System.out.println("metodo protegido " + metodoProtected());
        //System.out.println("metodo default " + c1.metodoDefault());
        //System.out.println("metodo privado " + c1.metodoPrivado());
    }

    public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.prueebaDesdeClase4();
    }
    
    
}
