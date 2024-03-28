package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import produto.Produto;

public class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Produto p1 = new Produto();
			boolean ide = false;
			
			
			
			while(!ide) {
				try {
					
				System.out.println("Informe o nome do produto: ");
				p1.nome_produto = input.next();
				
				System.out.println("Informe a marca do produto: ");
				p1.marca_produto = input.next();
				
				System.out.println("Informe a quantidade do produto: ");
				p1.qtd_produto = input.nextInt();
				
				System.out.println("Informe a data do produto: ");
				p1.data = input.next();
				
				System.out.println("Cadastro realizado.");
				
				return;
				
				}catch(InputMismatchException e){
					
					System.out.println("Uma chave já foi cadastrada! ");
					
				}
			}
		}
		


	}

}
