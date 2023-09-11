import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Lancement du programme");
        logger.debug("Lancement du programme");

        /*int input = 5;
        Factoriel factoriel = new Factoriel(input);
        int result = factoriel.getVal();
        System.out.println("Factorial of " + input + " is " + result);*/

        OccupationSalle occupation = new OccupationSalle();
        occupation.question3();
    }
}