package recei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class receita {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String nome = ler.nextLine();

	    try {
	      FileReader arq = new FileReader(nome);
	      BufferedReader lerArq = new BufferedReader(arq);
	      
	      FileWriter arqbar = new FileWriter("E:\\data\\DADOS_ABERTOS\\receita\\barueri17C.txt");
	      PrintWriter gravarArq = new PrintWriter(arqbar);

	      String linha = lerArq.readLine();    /* lê a primeira linha a variável "linha" 
	                                              recebe o valor "null" quando o processo
	      	                                      de repetição atingir o final do arquivo texto    */
	   
	      while (linha != null) {
	    	  
	    	String codigo = linha.substring(684).substring(0,4);   // seleciona codigo
	    	String cidade = linha.substring(684).substring(4,50);   // seleciona cidade
	    	  
	        if ((linha.substring(0,2).equals("1F") || linha.substring(0,2).equals("2F")) && 
	        		linha.substring(684).substring(0,4).equals("6213")) {
				
	        	gravarArq.println(linha);   // grava linha selecionada no arquivo novo
	        	System.out.printf("%s\n", cidade);   //  para confirmar a cidade selecionada e dar movimento na execusão 
				
			}

	        linha = lerArq.readLine(); // lê da segunda até a última linha
	        
	      }

	      arq.close();            // fechar o arquivo de leitura
	      arqbar.close();			// fechar o arquivo criado
	      
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());        // tratando erro de abertura do arquivo de leitura 
	    }

	    System.out.println();       //  estetica simplesmente 
	  }
	}