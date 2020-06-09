
public class PalabraReturnTiposPrimitivos {

    public static void main(String[] args) {

        sumarSinRetornarVAlor(3, 4);
        int resultado = sumarRetornandoVAlor(0, 0);
        System.out.println("el resultado de sumar retornando valor es : " + resultado);

    }

    private static void sumarSinRetornarVAlor(int a, int b) {
        System.out.println("el resultado de sumar sin retornar valor es : " + (a + b));
        //return;
    }

    private static int sumarRetornandoVAlor(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Puede ingresar valores distintos a 0");
            return 0;
        } else {
            System.out.println("Los valores proporcionados son distintos a 0");
            return a + b;
        }
    }

}
