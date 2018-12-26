package Ejercicio3;

public class LandaTest3 {

    public static void main(String[] args) {
        engine((x, y) -> x + y);
        engine((x, y) -> x - y);
        engine((x, y) -> x / y);
        engine((x, y) -> x * y);
        engine((x, y) -> x % y);
    }

    public static void engine(calculadora cal) {
        int x = 2, y = 4;
        int resultado = cal.calcular(x, y);
        System.out.println(resultado);
    }
}
