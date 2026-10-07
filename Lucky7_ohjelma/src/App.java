import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception { 
        //Säätöpöytä
        int rahat = 5;
        int maksu = 1;
        int arvottavat_numerot = 3;
        int numero = 0;
        int voittava_numero = 7;
        int[] arvotut_numerot = new int[arvottavat_numerot];
        int voittavia_numeroita = 0;
        int voitto_summa = 3;
        int voitto_bonus = 2;
        int voitto = 0;
        Random random_m = new Random();
        //Peli | Pyörii automaattisesti kunnes rahat eivät riitä pelaamiseen.
        while (rahat >= maksu) {
            System.out.println("Rahaa: " + rahat + "e | -" + maksu + "e");
            rahat = rahat - maksu; 
            for (int i = 0; i < arvottavat_numerot; i++) {
                numero = random_m.nextInt(10);
                numero++;
                //Numeroiden tallennus
                arvotut_numerot[i] = numero;
                System.out.println(numero);
            }
            //Onko voittavia numeroita?
            for (int i = 0; i < arvottavat_numerot; i++) {
                if (arvotut_numerot[i] == voittava_numero) {
                    voittavia_numeroita++;
                }
            }
            //Palkintojen jako
            if (voittavia_numeroita > 0) {
                voitto = 1;
                rahat = rahat + voitto_summa;
                for (int i = 1; i < voittavia_numeroita; i++) {
                    rahat = rahat + voitto_bonus;
                }
            }
            if (voitto == 1) {
                System.out.println("Voitit!");
            }
            else if (voitto == 0) {
                System.out.println("Hävisit!");
            }
            voittavia_numeroita = 0;
            voitto = 0;
        }
    }
}
