package Ejercicio4;

public class Principal {

    public static void main(String[] args) {
//        engine( (CalculadoraInt) (x, y) -> x + y );
//        engine( (CalculadoraLong) (x, y) -> x + y );
//        engine( (long x, long y) -> x + y );
//        engine( (int x, int y) -> x + y );
        CalculadoraInt calI = (x, y) -> x + y;
        CalculadoraLong calL = (x, y) -> x + y;

        engine(calL);
        engine(calI);
    }

    public static void engine(CalculadoraInt cal) {

    }

    public static void engine(CalculadoraLong cal) {

    }
}
