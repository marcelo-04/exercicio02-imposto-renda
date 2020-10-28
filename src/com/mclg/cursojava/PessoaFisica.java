package com.mclg.cursojava;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		
		double renda = this.getRendaBruta();
		
		if(renda <= 1400.0) {
			return 0;
		}
		
		else if(renda > 1400.0 && renda <= 2100.0) {
			return (renda * 0.1) - 100.0;
		}
		
		else if(renda > 2100.0 && renda <= 2800.0) {
			return (renda * 0.15) - 270.0;
		}
		
		else if(renda > 2800.0 && renda <= 3600.0) {
			return (renda * 0.25) - 500.0;
		}
		
		// Maior que 3600.0
		return (renda * 0.3) - 700.0;
	}

	@Override
	public String toString() {
		String s = "Pessoa Física [";
		s += super.toString();
		s += " ;CPF: "+ cpf;
		s += " ;O imposto a ser pago = "+ calcularImposto();
		s += "]";
		return s;
	}
}
