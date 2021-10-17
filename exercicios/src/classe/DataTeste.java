package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data = new Data();
		//data.dia = 12;
		//data.mes = 04;
		//data.ano = 1984;

		var data2 = new Data();
		data2.dia = 31;
		data2.mes = 01;
		data2.ano = 1964;

		data.obterDataFormatada();
		System.out.println(data.obterDataFormatada());
		System.out.printf("%d/%d/%d", data2.dia, data2.mes, data2.ano);

	}

}
