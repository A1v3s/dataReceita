package pacoteReceita;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class classeReceita {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader arquivo = new FileReader("C:\\PerfLogs\\DADOS_ABERTOS\\arq.L00001");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
//			String entrada; 
			
			linha = lerArquivo.readLine();
			
			while ( linha !=null) {
				// System.out.printf("%s\n", linha);

				//if (linha.substring(0,2) == "1F" || linha.substring(0,2) == "2F") {
				if (linha.substring(0,2).equals("1F") || linha.substring(0,2).equals("2F")) {
					System.out.println("Achei a entrada: " + linha.substring(0,2));
					
				}
				linha = lerArquivo.readLine();
			}
			lerArquivo.close();
			arquivo.close();
		}
		
		finally {
			
		    System.out.println("finally");
		    
		  }
	}

}
