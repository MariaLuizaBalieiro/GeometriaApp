package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
  System.out.println("Criando Triângulos...");
	
  // Criando dois triângulos 
  Triangulo t1 = new Triangulo();
  Triangulo t2 = new Triangulo();
  
	// Deinindo as propriedades dos triângulos 
    t1.altura = 20;
    t1.ladoc = 10;
    t1.ladob = 9;
    t1.base = 22;
    t1.nome = "Triângulo 001";
   
    t2.altura = 12;
    t2.ladoc = 5;
    t2.ladob = 9;
    t2.base = 10;
    t2.nome = "Triângulo 002"; 
    
    
    // Exibir dados dos triângulos 
    t1.exibirDados();
    t2.exibirDados();
   
	
	
	
	}

}
