package Ejercicio1;

public class LnadaTest {

    public static void main(String[] args) {

        FunctionTest ft = () -> {
            System.out.println("Hola mundo");
        };

        //ft.saludar();
        LnadaTest object = new LnadaTest();
        object.miMetodo(ft);
    }

    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}
