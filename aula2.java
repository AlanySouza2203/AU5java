//define a classe
package app;

public class mercado {
    //3.Metodo Principal
	public static void main(String[] args) {
		//3.1 Declaracao de variavel
		
		//dados dos produtos
		String nomeproduto = "Arroz camil 5kg";
		double precoproduto = 27.90;
		int estoqueproduto = 120;
		
		// Dados do Cliente
		String nomecliente ="Ana Carolina";
		int idadecliente = 35;
		char Generocliente = 'f';
		
		// dados do caixa
		int numerocaixa = 3;
		boolean caixaAberto = true;
		
		//exibir as informacoes
		System.out.println("====Sistema de mercado====");
		System.out.println("Produto" + nomeproduto);
		System.out.println("Preco"+ precoproduto);
		System.out.println("Estoque" + estoqueproduto + "Unidades");
		System.out.println("Cliente" + nomecliente);
		System.out.println("Cliente" + nomecliente + "( " + idadecliente + "anos)" );
		System.out.println("Idade" + idadecliente);
		System.out.println("Caixa nº" + numerocaixa + "Aberto?");
		
	}

}
