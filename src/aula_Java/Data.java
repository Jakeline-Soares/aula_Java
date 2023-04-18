package aula_Java;


import java.util.Date;

public class Data implements Cloneable {

	private Date data;

	public Data(Date data) { 
		this.data = data;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void Compara(Date dataInformada) {
		data.compareTo(dataInformada); // Método que compara a data corrente com a data do parâmetro
		if (data.equals(dataInformada)) { // Aqui dá uma condição se a data corrente é igual (equals) a data informada
			System.out.println("Datas iguais: " + 0);
		}
		if (data.before(dataInformada)) { // Aqui dá uma condição se a data corrente é anterior (before) à data informada
			System.out.println("Data informada maior que a data corrente: " + -1);
		}
		if (data.after(dataInformada)) { // Aqui dá uma condição se a data corrente vem primeiro (after) à data informada
			System.out.println("Data corrente maior que a data informada: " + 1);
		}
	}
	
	public Data clone() throws CloneNotSupportedException {		
		return (Data) super.clone();
	}	
}
	