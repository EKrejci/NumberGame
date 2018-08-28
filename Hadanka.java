import java.util.Scanner;

public class Hadanka {

    public static void main(String args[]){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Náhodně jsem vybral číslo mezi 1 a 100");
        System.out.println("Zkus ho uhádnout..");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("Máš "+ i + " pokusů. Hádej: ");
            int guess = scanner.nextInt();
            System.out.println("Tvůj tip byl: " +guess);

             // System.out.println("You picked "+guess);
          if (randomNumber > guess) {
                    System.out.println("Je to větší než " + guess + ".");
                }

                else if (randomNumber < guess) {
                    System.out.println("Je to menší než " + guess + ".");

                } else {
                    hasWon = true;
                    break;
                }
            }
            if(hasWon){
          System.out.println("SPRAVNE...VYHRAVAS!!!");
            }else{
          System.out.println("Už nemáš další pokusy. Ale zkus novou hru :-)");
          System.out.println("Číslo bylo: " + randomNumber);
            };
        }

}

