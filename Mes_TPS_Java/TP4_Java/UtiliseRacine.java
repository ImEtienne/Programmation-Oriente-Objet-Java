package TP4_Java;
/**
 * Décrivez votre classe UtiliseRacine ici.
 *
 * @author Etienne KIBONGANI
 * @version 14:22 - 18/11/2021
 */
public class UtiliseRacine
{
    public static void main(String[] argv) {
        Racine extracteur = new Racine(0.01);  
        try{
            double operande = (Double.valueOf(argv[0])).doubleValue();
            double valeurRacine;
            valeurRacine = extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision " + extracteur.getPrecision() + " , erreur =" + (valeurRacine - Math.sqrt(operande)));
            extracteur.setPrecision(0.00001);
            valeurRacine = extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision " + extracteur.getPrecision() + " , erreur =" +(valeurRacine - Math.sqrt(operande)));

        }catch (EtendantException e){
            System.out.println("fin" + e);
        }
    }
}