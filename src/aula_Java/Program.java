package aula_Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Data dataCorrente = new Data(formato.parse("21/04/2023"));
		Data dataParametro = new Data(formato.parse("22/04/2023"));
				
		dataCorrente.Compara(dataParametro.getData());
		
		Data dataClone = dataCorrente.clone(); //Aqui eu estou criando um novo objeto usando o método de clone. Ele vai clonar o valor de dataCorrente
		
		System.out.println(formato.format(dataClone.getData())); // Aqui a impressão do valor da data do objeto dataClone vai ser o mesmo do dataCorrente.
		System.out.println(formato.format(dataCorrente.getData()));
	}

}
