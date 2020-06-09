
package com.gm.javadoc;
/**
 * Esta clase permite realizar operaciones aritmeticas
 * 
 * @author elcha
 * @version 1.0
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    private int operandoA;
    /**
     * Segundo operando
     */
    
    int opernadoB;
    
    /**
     * Constructor vacio de clase
     */
    public Aritmetica(){
        
    }
    /**
     * Constructor con 2 operandos
     * @param operandoA primer operando
     * @param operandoB segundo operando
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.opernadoB = operandoB;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos
     * @return int resultado de la suma
     */
    public int sumar(){
        return this.operandoA + this.opernadoB;
    }
}
