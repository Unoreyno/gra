import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();
        
       
        
        

        

        Scanner Scanner = new Scanner(System.in);
        
        // statystyki
        int wynikW = 0;
        int wynikP = 0;
        int wynikR = 0;

        // Pierwsz wiadomośc na starcie
        System.out.println("Kliknij ENTER by zagrać w papier, kamień, nożyce");
        Scanner.nextLine();

        // warunek pętli z grą
        boolean gra = true;

        // pętla z grą, która kończy się gdy nie chcesz dalej grać
         do{
            System.out.println("Napisz kamień (k), papier (p) albo nożyce (n)");
            String znak = Scanner.nextLine();

        
        

            // Sprawdza co wybrałeś i sprawdza co wylosowano
            // i na podstawie tych informacji wyświetla wynik gry
            //daje pkt do statystyk
            switch(znak){
                case "k":
                    System.out.println("Wybrałeś kamień");
                    int zk = r.nextInt(3);
                    if(zk == 0){
                        System.out.println("Wylosowałem kamień, zremisowaliśmy");
                        wynikR =+ 1;
                    }else if(zk == 1){
                        System.out.println("Wylosowałem papier, przegrałeś");
                        wynikP =+ 1;
                    }else{
                        System.out.println("Wylosowałem nożyce, wygrałeś");
                        wynikW =+ 1;
                    }

                    break;
                case "p":
                    System.out.println("Wybrałeś  papier");
                    int zp =r.nextInt(3);
                    if(zp == 0){
                        System.out.println("Wylosowałem kamień, wygrałeś");
                        wynikW =+ 1;
                    
                    }else if(zp == 1){
                        System.out.println("Wylosowałem papier, zremisowaliśmy");
                        wynikR =+ 1;
                    }else{
                        System.out.println("Wylosowałem nożyce, przegrałeś");
                        wynikP =+ 1;
                    }

                    break;
                case "n":
                    System.out.println("Wybrałeś  nożyce");
                    int zn =r.nextInt(3);
                    if(zn == 0){
                        System.out.println("Wylosowałem kamień, przegrałeś");
                        wynikP =+ 1;
                    
                    }else if(zn == 1){
                        System.out.println("Wylosowałem papier, wygrałeś");
                        wynikW =+ 1;
                    }else{
                        System.out.println("Wylosowałem nożyce, zremisowaliśmy");
                        wynikR =+ 1;
                    }

                    break;
                
                default:

                    System.out.println("Zły znak");
                    break;
            }
            
                // Pyta o kontynuację gry
                Scanner.nextLine();
                System.out.println("Czy chcesz zagrać jeszcze raz? Napisz tak (lub t), żeby grać dalej");
                String odpo = Scanner.nextLine();

                // Sprawdza odpowiedź
                if (odpo.equals("tak")){
                    gra = true;
                }else if (odpo.equals("t")){
                    gra = true;
                }else{
                    gra = false;
                }

            

        }while(gra);
        

        
        // System.out.println("Wygrałeś "+wynikW+" razy, przegrałeś "+wynikP+" razy, a "+wynikR+" razy zremisowaliśmy");

        System.out.println("Twoje statystyki:");
        System.out.println("Wygrane: "+wynikW);
        System.out.println("Przegrane: "+wynikP);
        System.out.println("Remisy: "+wynikR);
        
    
        
        Scanner.close();
        
        
    }
}
    
