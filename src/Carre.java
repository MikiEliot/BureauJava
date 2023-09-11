import java.util.Scanner;
public class Carre {


    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le numero des cotes  : ");
        int cotes = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cotes; i++) {
            for (int j = 0; j < cotes; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
