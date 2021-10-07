package view;

import controller.EscalonadorController;
import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {
		EscalonadorController controller = new EscalonadorController();
		Fila fila = new Fila();
		
		String[] vetor = {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"};


		for(String populaFila : vetor) {
			System.out.println(populaFila);
			fila.insert(populaFila);
		}
		
		while(!fila.isEmpty()) {
			controller.escalonador(fila);
		}

	}
}
