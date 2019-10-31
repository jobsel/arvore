package pilha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtToPilha {

	public static void main(String[] args) {

		PilhaInteiro p = new PilhaInteiro(20);
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("numeros.txt"));
			for(int i=0;i<10;i++){
				p.empilhar(Integer.parseInt(br.readLine()));
			}
			p.mostrar();	
		} 
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		}
		catch (IOException e) {
			System.out.println("Linha inexistente!");
		}
		catch (NumberFormatException e) {
			System.out.println("Arquivo fora do padrão!");
		}
		

		
		
	}

}


}
