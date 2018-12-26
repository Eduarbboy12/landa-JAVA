package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(new Comensal("Javier", 10, 5),
                new Comensal("Carlos", 20, 8),
                new Comensal("Diaz", 30, 9),
                new Comensal("Eduardo", 40, 4),
                new Comensal("Herrera", 50, 3),
                new Comensal("Isa", 60, 2),
                new Comensal("Monica", 70, 1));
        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
        for (Object nombresComensal : nombresComensales) {
            System.out.println("El nombre es: " + nombresComensal);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func){
        List<Object> listaDatos = new ArrayList<>();
        for (Comensal comensal : listaCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }
}
