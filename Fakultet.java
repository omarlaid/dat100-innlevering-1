import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

    
        while (true) {
            System.out.print("Skriv inn et heltall n (>0): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ugyldig input. Tast inn et heltall.");
                scanner.next(); 
                continue;
            }
            n = scanner.nextInt();
            if (n > 0) break;
            System.out.println("n må være større enn 0. Prøv igjen.");
        }

        long fakultet = 1;
        for (int i = 2; i <= n; i++) {
            fakultet *= i;
        }

        System.out.println(n + "! = " + fakultet);
        scanner.close();
    }
}
