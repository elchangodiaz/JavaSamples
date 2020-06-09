package com.gm.mundopc;

public class Computadora {
    
    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Raton raton;
    private Monitor monitor;
    private Teclado teclado;
    
    private Computadora(){
        this.idComputadora = ++contadorComputadora;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public int getContadorComputadora() {
        return contadorComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", raton=" + raton + ", monitor=" + monitor + ", teclado=" + teclado + '}';
    }
    
 }
