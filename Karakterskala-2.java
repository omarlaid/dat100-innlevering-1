import java.util.Scanner;

public class Karakterskala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng;

          
        
            while (true) {
                System.out.print("Skriv inn poengsum for student " + i + ": ");
                poeng = scanner.nextInt();

                if (poeng >= 0 && poeng <= 100) {
                    break; 
                } else {
                    System.out.println("Ugyldig poengsum! Prøv igjen.");
                }
            }

            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }

        scanner.close();
    }
}
