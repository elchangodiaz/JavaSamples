public class Aritmetica {
    
    //atributos de clase
    int a;
    int b;
    
    public Aritmetica(){
//        a = 3;
//        b = 6;
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con 2 args");
    }
    
    public int sumar(){
        return a + b;
    }
    
    public int restar(){
        return a - b;        
    }
    
    public int multiplicar(){
        return a * b;
    }
    
    public int dividir(){
        return a / b;
    }
       
}
