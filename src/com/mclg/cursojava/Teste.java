package com.mclg.cursojava;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000.0);
		p1.setCpf("487.976.747-61");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000.0);
		p2.setCnpj("41.110.367/0001-45");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000.0);
		p3.setCpf("347.468.721-20");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 02");
		p4.setRendaBruta(3000.0);
		p4.setCnpj("73.382.135/0001-32");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 03");
		p5.setRendaBruta(3700.0);
		p5.setCpf("864.932.617-08");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 02");
		p6.setRendaBruta(4000.0);
		p6.setCnpj("26.013.472/0001-72");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte.toString());
		}
		scan.close();
	}
}
