import java.util.Scanner;

public class Triangle {

    public static void triangle(Scanner scan) {
        System.out.print("Entrez un nombre de cotés: ");
        int cotes = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= cotes; i += 2) {
            int espaces = (cotes - i) / 2;
            for (int j = 0; j < espaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        triangle(scan);
    }
}
