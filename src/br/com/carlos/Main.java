package br.com.carlos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("Qual a primeira nota ?");
		double nota = l.nextInt();
		
		System.out.println("Qual a segunda nota ?");
		nota += l.nextInt();
		
		System.out.println("Qual a segunda nota ?");
		nota += l.nextInt();
		
		System.out.println("Qual a segunda nota ?");
		nota += l.nextInt();
		
		nota /= 4;
		
	    System.out.println(verificarMedia(nota)+ " com a Média de: "+ nota);
	    
	}
	
	public static String verificarMedia (double nota){
	    
		if (nota>=7) {
	            return "Aprovado";
	    }else if (nota >= 5 && nota < 7){
	            return "Recuperação";
	    }else{
	            return "Reprovado";
	    }
	}
}
