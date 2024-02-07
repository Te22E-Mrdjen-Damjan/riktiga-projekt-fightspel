import java.time.chrono.HijrahEra;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Random tärning = new Random();
        String val ="1";
        // Start program-loop
        System.out.println("Menu");
        System.out.println("1-Starta Spel");
        System.out.println("2-regler");
        boolean spelstart = false;
        val = tangentbord.nextLine();

            if (val.equals("1")){
                System.out.println("spelet startar");
                spelstart=true;

            } 
            // Skapa spelar=100 och fiendeliv =100

            int fiendeliv = 100;
            int spelareliv = 100;

            // Gaming loop
            while(spelstart){
                int slumptal = tärning.nextInt(2);
                int slumptal2 = tärning.nextInt(2);
                System.out.println("tryck space för att slå");
                String Mellanslag = tangentbord.nextLine();
                // Om spealren träffar slumptal == 1
                if (slumptal==1 ){
                    // Minska fiendeliv med 20
                    fiendeliv = fiendeliv -20;
                    System.out.println("du skadade fiende med 20 liv, "+fiendeliv);

                }
                else{
                    System.out.println("Du missade");
                }

                // Hämta slumptal för finenden
                if (slumptal2==0){
                    spelareliv = spelareliv -20;
                    System.out.println("du blev skadad med 20 liv, "+fiendeliv);
                }
                // Om fienden  träffar

                // Minska spelarliv med 20
            
            
            // Slut program-loop
        }
    }
}   
