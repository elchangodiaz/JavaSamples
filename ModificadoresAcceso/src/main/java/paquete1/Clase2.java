package paquete1;

public class Clase2 {

    public Clase2() {
        //Prueba de constructores de la clase 1
        new Clase1(); //llamada al constructor publico
        new Clase1("uno", "dos"); //llamada constructor protected
        new Clase1("uno", "dos", "tres"); //llamada al constructor default o package
        //new Clase1("uno", "dos", "tres", "cuatro"); //llamada constructor privado 
        //constructores privados no pueden ser llamados desde otras clases, sin importar si es el mismo paquete
    }

    public void prueebaDesdeClase2() {
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("atrubuto publico " + c1.atributoPublico);
        System.out.println("atrubuto protegido " + c1.atributoProtegido);
        System.out.println("atributo default " + c1.atributoDefault);
        //System.out.println("atrubuto privado " + c1.atributoPrivate);

        System.out.println("");

        System.out.println("metodo publico " + c1.metodoPublico());
        System.out.println("metodo protegido " + c1.metodoProtected());
        System.out.println("metodo default " + c1.metodoDefault());
        //System.out.println("metodo privado " + c1.metodoPrivado());
    }

    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.prueebaDesdeClase2();
    }

}
