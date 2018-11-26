import java.util.Random;

public class Aleatorios {
	
    public void sorteio () {
    	Random r = new Random();
    	
    	for (int i = 0; i < 100; i++) {
    		System.out.println(r.nextInt(100));
    	}
    }
    
    public static void main(String[] args) {
    	Aleatorios num = new Aleatorios();
    	
    	num.sorteio();
    }
}
