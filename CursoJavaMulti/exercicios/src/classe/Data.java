package classe;

//import java.util.Date;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		
		//byte short, int, long -> 0
		//float, double -> 0.0
		// char -> ''
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);

	}
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
