import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ler {
	private List<String> palavras = new ArrayList<>();
	
    public void leitura () throws IOException {
        FileReader arquivo;
        BufferedReader texto;

        arquivo = new FileReader("bd.txt");
        texto = new BufferedReader(arquivo);

        String linha = texto.readLine();

        while (linha != null) {
            palavras.add(linha); 
            linha = texto.readLine();
        }
        
        for (int i = 0; i < 10; i++) {
        	System.out.print(palavras.get(i));
        }
        
        texto.close();
    }
    
    public static void main(String[] args) throws IOException  {
    	Ler ler = new Ler();
    	
    	try {    		
    		ler.leitura();            
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
}
