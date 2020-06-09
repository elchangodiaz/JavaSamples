
import java.util.Scanner;

public class HolaMundo {

    /*psvm + tab        y         sout + tab*/
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        ////////////////////////////////////////////////////////////
        /* String saludar = "saludos";
        
        System.out.println(saludar);
        System.out.println(saludar);
        System.out.println(saludar);
        
        var despedirse = "Hasta luego";
        
        System.out.println(despedirse);
        
        var num = 1;
        
        System.out.println(num);*/
 /*
       var usuario = "Juan";
       var saludar = "Hola";
       
        System.out.println(saludar + " " + usuario);
        
        var i = 5;
        var j = 3;
        
        System.out.println(i+j+usuario);
         */
 /*
       String nombre = "Karla";
       String apellido = "Esparza";
       
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        System.out.println("saludos");
        System.out.print("hey");
        System.out.print("hey");
        System.out.print("hey");
         */
 /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");                
        var usuario = scanner.nextLine();
        System.out.println("usuario = " + usuario);
         */
 /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el titulo:\t");
        var titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:\t");
        var autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
         */
 /*
        //byte, short, int, long
        byte byteVar = 127;
        System.out.println("bteVar = " + byteVar);

        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipos byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor minimo tipo byte: " + Byte.MAX_VALUE + "\n");

        short shortVar = -32768;

        System.out.println("shortVar = " + shortVar);

        System.out.println("bits tipo Short: " + Short.SIZE);
        System.out.println("bytes tipos Short: " + Short.BYTES);
        System.out.println("valor minimo tipo Short: " + Short.MIN_VALUE);
        System.out.println("valor minimo tipo Short: " + Short.MAX_VALUE + "\n");

        int intVar = 2147483647;

        System.out.println("intVAr = " + intVar);

        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipos int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor minimo tipo int: " + Integer.MAX_VALUE + "\n");

        long longVar = -9223372036854775808L;

        System.out.println("longVar = " + longVar);

        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipos long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor minimo tipo long: " + Long.MAX_VALUE + "\n");
        
        
        var numero = 9223372036854775807L;  //por default es tipo entero
        System.out.println("numero: " + numero);
         */
 /*
        int numeroDecimal = 10;
        System.out.println("numeroDecimal = " + numeroDecimal);

        int numeroOctal = 012;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        int numeroBinario = 0b1010;
        System.out.println("numeroBinario = " + numeroBinario);
         */
 /*
        float floatVar = 1000.01F;
        System.out.println("floatVar: " + floatVar);

        System.out.println("bits en el tipo float: " + Float.SIZE);
        System.out.println("bytes en el tipo flot: " + Float.BYTES);
        System.out.println("valor min en float: " + Float.MIN_VALUE);
        System.out.println("valor max en float: " + Float.MAX_VALUE + "\n");

        double doubleVar = 1000.0232;    //10000.0232D
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("bits en el tipo double: " + Double.SIZE);
        System.out.println("bytes en el tipo double: " + Double.BYTES);
        System.out.println("valor min en double: " + Double.MIN_VALUE);
        System.out.println("valor max en double: " + Double.MAX_VALUE + "\n");
         */
 /*
        System.out.println("bits en el tipo char: " + Character.SIZE);
        System.out.println("bytes en el tipo char: " + Character.BYTES);
        System.out.println("valor min en char: " + Character.MIN_VALUE);
        System.out.println("valor max en char: " + Character.MAX_VALUE + "\n");

        char varChar = '\u00AE';
        System.out.println("car en unicode = " + varChar);

        char varCharD = 174;
        System.out.println("char en decimal = " + varCharD);

        char varCharSimbolo = '®';
        System.out.println("char en Simbolo = " + varCharSimbolo);
         */
 /*
        //boolean
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = false;

        if (booleanVar) {
            System.out.println("el valor es verdadero");
        } else {
            System.out.println("el valor es falso \n");
        }

        var edad = 10;
        var esAdulto = edad >= 18;
        //regresa boolan
        System.out.println("esAdulto: " + esAdulto);
         */
        //convertir string a int
        /*
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
 
        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        char c = "hola".charAt(0);
        System.out.println("char : " + c);
        
        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        String edadTexto = String.valueOf(false);
        System.out.println("edadTexto: " + edadTexto);
        
        
        short s = 128;
        byte b = (byte)s;
        
        System.out.println("b: " + b);
         */
 /*       
        String nombre;
        int id;
        double precio;
        char simbolo;
        boolean envio;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: \n");
        nombre = scanner.nextLine();
        System.out.println("Proporciona el id: \n");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio: \n");
        precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo: \n");
        simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envio gratuito: \n");
        envio = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("Nombre: " + nombre +"\n"  
                         + "ID: " + id +"\n"
                         + "Precio: " + precio +"\n"
                         + "Simbolo: " + simbolo +"\n"
                         + "Envio: " + envio);

         */
 /*
        int a = 3, b = 2;

        int resultado = a + b;
        System.out.println(resultado);
        System.out.println("resultado suma: " + (a + b));
        
        resultado = a - b;
        System.out.println(resultado);
        System.out.println("resultado resta: " + (a - b));
        
        resultado = a / b;
        System.out.println(resultado);
        System.out.println("resultado div: " + (a / b));
        
        resultado = a * b;
        System.out.println(resultado);
        System.out.println("resultado mult: " + (a * b));
        
        resultado = a % b;
        System.out.println(resultado);
        System.out.println("resultado modulo: " + (a % b));
        
        resultado = a % 2;
        System.out.println(resultado);
        System.out.println("resultado: modulo a: " + resultado);
        
        resultado = b % 2;
        System.out.println(resultado);
        System.out.println("resultado modulo b: : " + resultado);
        if(resultado == 0){
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
         */
 /*
        int altura;
        int anchura;
        int area;
        int perimetro;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la altura");
        altura = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Introduce la anchura");
        anchura = Integer.parseInt(scanner.nextLine());
        
        area = altura * anchura;
        System.out.println("Area: " + area);
        
        perimetro = (altura+anchura)*2;
        System.out.println("Perimetro: " + perimetro);
         */
 /*
        int a = 3, b = 2, c;

        c = a + 5 + b;
        System.out.println(c);

        a += 1;  //a+1=4
        System.out.println(a);

        a += 3;  //a+1=4
        System.out.println(a);
        
        b -= 1;
        System.out.println(b);
         */
 /*
 //operadores unarios
        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);

        int e = 3;
        int f = ++e;
        System.out.println("e  " + e);
        System.out.println("f = " + f);

        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
         */
 /*
 //operadores de igualdad y relacionales
 
        int a=3, b=2;
        
        boolean c = (a == b);
        System.out.println("c = " + c);
        
        c = (a != b);
        System.out.println("c = " + c);  
        
        String cadena = "Hola";
        String cadena2 = "Adios";
        System.out.println(cadena.equals(cadena2));
        
        boolean d = a > b;
        System.out.println("d = " + d);
        
        if(b % 2 == 0){
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
        
        int edad = 8;
        int adulto = 18;
        
        if(edad >= adulto)
            System.out.println("es adulto");
        else
            System.out.println("es menor de edad");
         */
 /*
 // operadores condicionales
 
        int a = 10;
        int valMin = 0, valMax = 10;
        boolean res = a >= valMin && a <= valMax;
        System.out.println("res = "+ res);
        
        boolean vacaciones = true;
        boolean diaDescanso = false;
        if(vacaciones || diaDescanso)
            System.out.println("Puede asistir");
        else
            System.out.println("No puede asistir");
         */
 /*
        //operador terneario
        var res = (3 > 2) ? true : false;
        System.out.println("res = " + res);

        var res1 = (3 > 2) ? "verdadero" : "falso";
        System.out.println("res1 = " + res1);
        
        var numero = 7;
        var par = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("numero es: " + par);
         */
 /*
 
 int num1, num2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el numero 1");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero 2");
        num2 = Integer.parseInt(scanner.nextLine());
        
        var res = (num1 > num2) ? true : false;
        
        if (res == true)
                 System.out.println("El numero mayor es: Numero 1");
        else
                 System.out.println("El numero mayor es: Numero 2");
        
         */
 /*
        //precedencia de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--; //x=6    y=10

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("Ejemplo 2");
        var res = 4 + 5 * 6 / 3;            //de izq a derecha con jerarquias
        System.out.println("Resultado: " + res);
        
        res = (4 + 5) * 6 / 3;            //de izq a derecha con jerarquias
        System.out.println("Resultado: " + res);
         */
 /*
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        
        System.out.println(6/3);
        System.out.println(2*4);
        System.out.println(-3+8);
        System.out.println(5-3);
        System.out.println(2+2);
        
        System.out.println("res = " + res);
        
         */
 /*
        //sentebcias de control 
        var condicion = false;

        if (condicion) {
            System.out.println("condicion verdadero");
        } else {
            System.out.println("condicion falso");
        }

        var num = 3;

        if (num == 1) {
            System.out.println("numero = 1");
        } else if (num == 2) {
            System.out.println("numero = 2");
        } else if (num == 3) {
            System.out.println("numero = 3");
        } else {
            System.out.println("numero desconocido");
        }

        var numeroTexto = "numero desconocido";
        
        if (num == 1) {
            numeroTexto = "numero uno";
        } else if (num == 2) {
            numeroTexto = "numero dos";
        } else if (num == 3) {
            numeroTexto = "numero tres";
        } else {
            numeroTexto = "numero desconocido";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
         */
 /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona calificacion: \n");
        double calificacion = Double.parseDouble(scanner.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else
            System.out.println("Valor desconocido");
         */
 /*
        var mes = scanner.nextInt();
        
        System.out.println("ingresa el mes");
        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Mes incorrecto";
        }

        System.out.println(estacion);
         */
        //    switch
        /*
        var numero = 2;
        var numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            default:
                numeroTexto = "numero desconocido";
                
        }
        
        System.out.println("numero texto: " + numeroTexto + " para el numero proporcionado: " + numero);
         */
        //   switch
        /*
        Scanner scanner = new Scanner(System.in);
        var mes = scanner.nextInt();
        String estacion = null;
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
                
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
        
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            
            default:
                estacion = "No se ha seleccionado una estacion valida";
        }
        
        System.out.println("Estacion " + estacion);
        
         */
        // While
        /*
        var contador = 0;
        
//        while(contador < 3){
//            System.out.println("contador: " + contador);
//            contador++;
//        }
//        
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 3);
         */
        
/*        
//        for (var i = 0; i < 3; i++) {
//            //imprimimos solo pares
//            if (i % 2 == 0) {
//                System.out.println("i: " + i);
//                break;
//            }
//        }

        inicio:
        for (var i = 0; i < 3; i++) {
            //imprimimos solo pares
            if (i % 2 != 0) {
               // continue inicio;
            }
            System.out.println("i: " + i);

        }
*/




    }

}
