package TP6_Java.Partie2;
/**
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 18:07 - 08/12/2021
 * 
 */
public class Main
{
    public static void main(String [] args){
        // Vegetable pdt = new Potatoe(0.3, 10);
        // Vegetable c = new Carrot(0.25, 30);
        // System.out.println(pdt);
        // System.out.println(c);
        
        // Soup s = new Soup();
        // s.add(new Potatoe(0.3, 10));
        // s.add(new Carrot(0.25, 30));
        // s.add(new Potatoe(0.500));
        // System.out.println(s);
        
        Soup s = new Soup();
        s.add(new Potatoe(0.3, 10));
        s.add(new Carrot(0.25, 30));
        System.out.println(s.getPeelingWeight());
    }
}
