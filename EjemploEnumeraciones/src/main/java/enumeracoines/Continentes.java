
package enumeracoines;


public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14),
    ANTARTIDA(1);
    
    //ATRIBUTO DE PAISES
    private final int paises;
    
    //constructor
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    
}
