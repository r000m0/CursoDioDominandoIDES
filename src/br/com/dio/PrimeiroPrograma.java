package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*
		 * int a = 5; int b = 2; System.out.println("Hello World! " + (a+b));
		 */

		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livros{
	private String titulo;
	private String autor;
}