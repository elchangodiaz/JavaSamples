
public class PruebaAritmetica {

    public static void main(String[] args) {
        /* 
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 3;
        int resultado = aritmetica.sumar();
        
        System.out.println("resultado: " + resultado);
        
        //creamos 2do objeto
        
        Aritmetica aritmetica2 = new Aritmetica(4, 2);
        System.out.println("resultado2 = " + aritmetica2.sumar());
        */
        
        int operandoA = 6;
        int operandoB = 2;
        
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        System.out.println("\nsuma = " + objeto1.sumar());
        
        System.out.println("\nresta = " + objeto1.restar());
        
        System.out.println("\nmultiplicacion = " + objeto1.multiplicar());
        
        System.out.println("\ndivicion = " + objeto1.dividir());
        
    }
    
//    public void otroMetodo(){
//        System.out.println();
//    }

}
