package br.senai.sp.model;

public class Triangulo {

	public double base;
	public double ladob;
	public double ladoc; 
	public double altura;
	public String nome;
	
	public void exibirDados(){
		System.out.println("---------------");
		   System.out.println(nome);
		   System.out.println("Altura:" + altura);
		   System.out.println("Ladoc:" + ladoc);
		   System.out.println("Ladob:" + ladob);
		   System.out.println("Base:" + base);
		   System.out.println();
			
	}
	
}
