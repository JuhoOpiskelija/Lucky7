import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int kierrokset = 3;
        Random random_m = new Random();
        int numero = 0;
        int[] arvotut_numerot = new int[kierrokset];
        for (int i = 0; i < kierrokset; i++) {
            numero = random_m.nextInt(10);
            numero++;
            arvotut_numerot[i] = numero;
            System.out.println(numero);
        }
        int voitto = 0;
        for (int i = 0; i < kierrokset; i++) {
            if (arvotut_numerot[i] == 7) {
                voitto = 1;
            }
        }
        if (voitto == 1) {
            System.out.println("Voitit!");
        }
        else if (voitto == 0) {
            System.out.println("Hävisit!");
        }
    }
}
