package controller;

import java.util.Scanner;
import model.Cat;
import model.Dog;

public class ExecutaSistema {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cat gato;
		Dog cachorro;

		System.out.println("***************************************");
		System.out.println("|        Cadastre o seu animal        |");
		System.out.println("***************************************");
		System.out.println("| 1 - Gato                             ");
		System.out.println("| 2 - Cachoro                          ");
		System.out.println("***************************************");

		int opcao = Integer.parseInt(sc.nextLine());

		switch (opcao) {
		case 1:
			gato = new Cat();
			System.out.println("Digite o nome do seu gato");
			gato.setNome(sc.nextLine());

			System.out.println("Digite a idade do seu gato");
			gato.setIdade(Integer.parseInt(sc.nextLine()));

			System.out.println("Digite a raça do seu gato");
			gato.setRaca(sc.nextLine());

			break;

		case 2:
			cachorro = new Dog();
			System.out.println("Digite o nome do seu gato");
			cachorro.setNome(sc.nextLine());

			System.out.println("Digite a idade do seu gato");
			cachorro.setIdade(Integer.parseInt(sc.nextLine()));

			System.out.println("Digite a raça do seu gato");
			cachorro.setRaca(sc.nextLine());

			break;

		default:

		}
		sc.close();
	}
}
