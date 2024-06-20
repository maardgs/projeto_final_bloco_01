package pizzaria;

import java.util.Scanner;

import pizzaria.util.Cores;

public class MenuInicial {

	public static void main(String[] args) {
		
		/* PROJETO AVALIAÇÃO - MÓDULO 1 
		 * E-COMMERCE: PIZZARIA ARTESANAL 
		 * 20 DE JUNHO DE 2024 */
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLUE_BACKGROUND + "''''''''''''''''''''''''''''''''''''''''");
			System.out.println("                                        ");
			System.out.println("       PIZZARIA ARTESANAL               ");
			System.out.println("                                        ");
			System.out.println("''''''''''''''''''''''''''''''''''''''''");
			System.out.println("                                        ");
			System.out.println("       1.Realizar Cadastro              ");
			System.out.println("       2.Ver Cardápio                   ");
			System.out.println("       3.Realizar Pedido                ");
			System.out.println("       4.Atualizar dados do cadastro    ");
			System.out.println("       5.Apagar cadastro                ");
			System.out.println("       6.Sair                           ");
			System.out.println("                                        ");
			System.out.println("''''''''''''''''''''''''''''''''''''''''");
			System.out.println("Entre na opção desejada:                ");
			System.out.println("                                        " + Cores.TEXT_RESET);

			opcao = sc.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "\nObrigada, volte sempre!");
				sobre();
				sc.close();
				System.exit(0);
			}
		
		switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "Realizar Cadastro\n\n");
			
				break;
			
			case 2:
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "Ver Cardápio: ");
				
				break;
				
			case 3:
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "Realizar Pedido\n\n");
				
				break;
				
			case 4:
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "Atualizar dados de Cadastro\n\n");
				
				break;
				
			case 5:
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "Apagar cadastro\n\n");
				
				break;
			
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOps! Essa opção é inválida :(\n");
					break;
		}

	}

}

	public static void sobre() {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''");
		System.out.println("                                        ");
		System.out.println("                                        ");
		System.out.println("Projeto desenvolvido por: Marília Marques");
		}
}