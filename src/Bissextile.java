import java.util.Scanner;

public class Bissextile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez une annee  : ");
        int annee = scan.nextInt();
        scan.nextLine();

        System.out.print("Entrez un mois (1-12) : ");
        int mois = scan.nextInt();
        scan.nextLine();
        System.out.print("Entrez un jour (1-31) : ");
        int jour = scan.nextInt();
        scan.close();
        if (estBissextile(annee) && mois == 2 && (jour >= 1 && jour <= 29)) {
            System.out.println(annee + " est bissextile et la date est valide.");
        } else if (!estBissextile(annee) && mois == 2 && (jour >= 1 && jour <= 28)) {
            System.out.println(annee + " n'est pas bissextile et la date est valide.");
        } else if (mois >= 1 && mois <= 12) {
            if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour <= 30)) {
                System.out.println("La date est valide.");
            } else if ((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) && (jour >= 1 && jour <= 31)) {
                System.out.println("La date est valide.");
            } else {
                System.out.println("La date n'est pas valide.");
            }
        } else {
            System.out.println("La date n'est pas valide.");
        }

        if (estBissextile(annee)) {
            System.out.println(annee + " est bissextile");
        } else {
            System.out.println(annee + " n'est pas bissextile");
        }
    }

    public static boolean estBissextile(int annee) {
        return (annee % 4 == 0 || annee % 100 == 0) && (annee % 400 != 0);
    }




}


