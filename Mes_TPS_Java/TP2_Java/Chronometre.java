package TP2_Java;
/**
 * Décrivez votre classe Chronometre ici.
 */
public class Chronometre
{
    private long debut; 
    public Chronometre(){
        debut = System.nanoTime();
    }
    public long dureeMicro(){
        return (System.nanoTime() - debut) / 1000;
    }
    public long dureeMilli(){
        return  dureeMicro()/1000000;
    }
    public void reset(){
        debut = System.nanoTime();
    }
}
