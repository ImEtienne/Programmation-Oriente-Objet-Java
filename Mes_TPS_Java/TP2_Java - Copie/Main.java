package TP2_Java;
/**
 * Décrivez votre classe Main ici.
 *
 */
public class Main
{
    public static void main(String[] args) {
         Chronometre chronometre = new Chronometre();
         for(int i=1;i<=1000000;i=i+1) {
             if (i%1000==0) {
             System.out.println(i + " " + chronometre.dureeMicro());
             }
         }
         System.out.println(chronometre.dureeMilli());
         chronometre.reset();
         
         for(int i=1000000;i>=1;i=i-1) {
             if (i%1000==0) {
             System.out.println(i + " " + chronometre.dureeMicro());
             }
         }
         System.out.println(chronometre.dureeMilli());
     } 
}