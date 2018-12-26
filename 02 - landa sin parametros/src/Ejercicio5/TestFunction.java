package Ejercicio5;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        //forma antigua
//        Function<Integer, String> convertidor = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return null;
//            }
//        };

        //forma landa
        Function<Integer, String> convertidor = (x) -> Integer.toString(x);
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(3000).length());
    }
}
