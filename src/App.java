
import java.util.Random;
import java.util.Scanner;



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
                    System.out.println("Du skadade fiende med 20 liv, "+fiendeliv);

                }
                else{
                    System.out.println("Du missade");
                }

                // Hämta slumptal för finenden
                if (slumptal2==1){
                    spelareliv = spelareliv -20;
                    System.out.println("Du blev skadad med 20 liv, "+spelareliv);
                }
                else{
                  System.out.println("Fienden missade");  
                }
                if (spelareliv==0){System.out.println("Du förlorade");
                spelstart=false;
                }
                if(fiendeliv==0){System.out.println("Du Vann!");
                spelstart=false;
                }
                if(spelareliv==0&&fiendeliv==0){System.out.println("Draw");
                spelstart=false;
                }
            // Slut program-loop1

        }
    }
}   
