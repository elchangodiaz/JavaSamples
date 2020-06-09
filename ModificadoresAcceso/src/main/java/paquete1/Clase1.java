package paquete1;

public class Clase1 {
    //Definicion de atributos
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivate = "Valor atributo privado";
    
    public Clase1(){
        System.out.println("Constructor publico vacio");
    }
    
    public Clase1(String texto){
        System.out.println("Constructor publico con un argumento " + texto);
    }
    
    protected Clase1(String texto1, String texto2){
        System.out.println("Constructor protected con 2 argumentos " + texto1 + 
                " " + texto2);
    }
    
    Clase1(String texto1, String texto2, String texto3){
        System.out.println("Constructor deafult o package");
    }
    
    private Clase1(String texto1, String texto2, String texto3, String texto4){
        System.out.println("Constructor privado");
    }
    
    //Metodos de clase
    public String metodoPublico(){
        return "Metodo Publico";
    }
    
    protected String metodoProtected(){
        return "Metodo protegido";
    }
    
    String metodoDefault(){
        return "Metodo default o Package";
    }
    
    private String metodoPrivado(){
        return "Metodo Privado";
    }
}
