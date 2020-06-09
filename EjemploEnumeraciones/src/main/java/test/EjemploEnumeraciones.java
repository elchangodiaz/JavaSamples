package test;

import enumeracoines.*;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);
        System.out.println("Valor 3: " + Dias.MIERCOLES);
        System.out.println("Valor 4: " + Dias.JUEVES);
        System.out.println("Valor 5: " + Dias.VIERNES);
        System.out.println("Valor 6: " + Dias.SABADO);
        System.out.println("Valor 7: " + Dias.DOMINGO);

        System.out.println("");

        //utilizamos enum paises
        System.out.println("Continentes no 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises del continente 4: "
                + Continentes.AMERICA.getPaises());

        System.out.println("Continentes no 1: " + Continentes.AFRICA);
        System.out.println("Numero de paises del continente 1: "
                + Continentes.AFRICA.getPaises());
        System.out.println("");

        indicarDia(Dias.DOMINGO);
        indicarDia(Dias.LUNES);

    }

    private static void indicarDia(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;

        }
    }

}
