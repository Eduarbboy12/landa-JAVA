/************************************************/
/**************** Sintaxis Landa ****************/
/************************************************/

//parametros -> cuerpo
//Forma antigua
public interface ficticia {
	public void aceptar(int valor, int valor2);
}

Ficticia f = new Ficticia() {
	@Override
	public void aceptar(int valor, int valor2) {
		System.out.println("cuerpo del metodo implementado aceptar" + valor + valor2);
	}
}
//Forma landa
Ficticia f = (valor, valor2) -> {
	System.out.println("cuerpo del metodo implementado aceptar"+ valor + valor2);
};

//simula el return
Ficticia f = (valor, valor2) -> valor / valor2
Ficticia f = (valor, valor2) -> return valor / valor2


/***********************************Ejercicio numero 2************************************/
//Forma antigua
public interface ActionListener {
	public void ActionPerformed(ActionEvent event)
}

JButton button = new JButton("Hola");

button.addActionListener(new ActionListener() {
	@Override
	public void ActionPerformed(ActionEvent event){
		System.out.println("Hola mundo");
	}
});

//Forma Landa
button.addActionListener(
	() -> {
		System.out.println("Hola mundo");
	}
);