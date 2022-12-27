package TP4_Java;
/**
 * Décrivez votre classe MoyenneException ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MoyenneException
{
    /**
     * Méthode principale
     * @
     */
    public static void main(String[] argv){
        // if (argv.length <= 0){
             // System.out.println("Il n'y a pas d'arguments");
             // System.exit(1);
        // }
         try{
             int moyenne = moyenne(argv);
             System.out.println("La moyenne est " + moyenne);
        } catch (NumberFormatException e){
                System.out.println("L'argument "+ e + " n'est pas du type entier");
        } catch (ArithmeticException e){
                System.out.println("Division par zéro");
        }
        System.out.println("continue");
    }
    /**
     * Méthode qui permet de calculer la moyenne 
     * @return 
     */
    public static int moyenne(String[] argv){
         int somme = 0;
         int cpt = 0;
         for (int i = 0; i < argv.length; i++){
             somme += Integer.parseInt(argv[i]);
             cpt++;
         }
         return somme / cpt;
     }  
}