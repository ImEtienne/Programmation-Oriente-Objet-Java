package TP2_Java;
/**
 * Décrivez votre classe Attente ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Attente
{
    private long duree;
    private Chronometre chrono;
    
    public Attente (long duree){
        this.duree = duree;
        this.chrono = new Chronometre();
    }
    
    public boolean tempsDepasse(){
        return (duree - chrono.dureeMicro() <=0);
    }
    
    public static void nanosleep(long nanoseconds) {
         try {
             java.util.concurrent.TimeUnit.NANOSECONDS.sleep(nanoseconds);
         }
         catch (java.lang.InterruptedException e) {
             throw new java.lang.AssertionError(e);
         }
    }
    public void attendFin(){
        if(!tempsDepasse()){
            nanosleep(duree - chrono.dureeMicro() * 1000);
        }
    }
}
