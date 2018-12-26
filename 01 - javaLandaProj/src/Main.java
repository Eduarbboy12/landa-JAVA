import clases.ficticia;
import interfaces.funtionalExample;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio del programa");
        funtionalExample f = parametro -> System.out.println(parametro);
        ficticia obj = new ficticia();
        //Forma Antigua
        obj.Metodo(new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        });

        //Forma Landa
        obj.Metodo( (parametro) -> {
            return parametro;
        });
    }
}
