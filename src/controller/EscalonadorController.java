package controller;

import model.Fila;

public class EscalonadorController {
	
	
	public void escalonador(Fila fila) throws Exception {		
		
		String processo = fila.remove();
		String[] splitProcesso = processo.split(";");
		System.out.println("Processo: " + processo + " removido!");
		int processos = Integer.valueOf(splitProcesso[1]) - 1;
		if(processos > 0) {
			fila.insert(splitProcesso[0] + ";" + processos);
			System.out.println("Processo: " + splitProcesso[0] + ";" + processos + " adicionado!");
		}
		
	}

}
