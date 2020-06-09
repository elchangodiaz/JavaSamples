package ejemploclasesabstractas;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

    //Creacion de objetos
    //FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); no se puede instanciar de clases abstractas
    public static void main(String[] args) {

        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();

        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();        
    }
}
