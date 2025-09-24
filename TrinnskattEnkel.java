import java.util.Scanner;

public class TrinnskattEnkel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi bruttoinntekt: ");
        double brutto = scanner.nextDouble();
        double skatt = 0;

        if (brutto > 217400 && brutto <= 306050) {
            skatt += (brutto - 217400) * 0.017;
        }

        if (brutto > 306050 && brutto <= 697150) {
            skatt += (306050 - 217400) * 0.017;       
            skatt += (brutto - 306050) * 0.04; 
        }

        if (brutto > 697150 && brutto <= 942400) {
            skatt += (306050 - 217400) * 0.017;
            skatt += (697150 - 306050) * 0.04;
            skatt += (brutto - 697150) * 0.137;
        }

        if (brutto > 942400 && brutto <= 1410750) {
            skatt += (306050 - 217400) * 0.017;
            skatt += (697150 - 306050) * 0.04;
            skatt += (942400 - 697150) * 0.137;
            skatt += (brutto - 942400) * 0.167;
        }

        if (brutto > 1410750) {
            skatt += (306050 - 217400) * 0.017;
            skatt += (697150 - 306050) * 0.04;
            skatt += (942400 - 697150) * 0.137;
            skatt += (1410750 - 942400) * 0.167;
            skatt += (brutto - 1410750) * 0.177;
        }

        System.out.println("Trinnskatt: " + skatt + " kr");

        scanner.close();
    }
}
