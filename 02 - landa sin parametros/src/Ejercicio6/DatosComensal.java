package Ejercicio6;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
        Comensal comensal = new Comensal("Carlos", 256.2, 5);
        String nombreComensal = (String) getDatoComensal(comensal, x -> x.getNombre());
        int mesa = (int) getDatoComensal(comensal, x -> x.getMesa());
        double monto = (double) getDatoComensal(comensal, x -> x.getMonto_pedido());
        System.out.println("El nombre es: " + nombreComensal);
        System.out.println("El monto es: " + monto);
        System.out.println("La mesa es: " + mesa);
    }

    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> func) {
        return func.apply(com);
    }
}
