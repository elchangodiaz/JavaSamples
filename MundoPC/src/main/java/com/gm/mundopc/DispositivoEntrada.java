package com.gm.mundopc;

public class DispositivoEntrada {
    
    private String tipoEntrada;
    private String Marca;
    
    public DispositivoEntrada(String tipoEntrada, String Marca){
        this.tipoEntrada = tipoEntrada;
        this.Marca = Marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", Marca=" + Marca + '}';
    }
    
    
}
