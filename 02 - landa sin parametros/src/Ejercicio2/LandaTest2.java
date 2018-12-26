package Ejercicio2;

public class LandaTest2 {

    public static void main(String[] args) {
        Operaciones op = (num, num2) -> {
            System.out.println("El resutado es: ");
            System.out.println(num + num2);
        };

        LandaTest2 mm = new LandaTest2();
        mm.miMetodo((num1, num2) -> {
            System.out.println("Parametro 1: " + num1 + "Parametro 2: " + num2);
            }, 50, 70);
    }

    public void miMetodo(Operaciones parametro, int num, int num2) {
        parametro.imprimeOperacion(num, num2);
    }
}
