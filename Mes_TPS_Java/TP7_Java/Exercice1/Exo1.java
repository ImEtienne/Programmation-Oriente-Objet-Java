package TP7_Java.Exercice1;
import java.util.ArrayList;
import java.util.List;

/**
 * Décrivez votre classe Exo1 ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Exo1
{
    public static <E> boolean doublons (ArrayList<E> ls){
        //for(int i=0; i < ls.size(); i++)
        //if(ls.lastIndexOf(ls.get(i))>i)
        for(int i = 0; i < ls.size(); i++){
            if(ls.lastIndexOf(ls.get(i)) > i) return true;
        }
        return false;
    }
    
    public static <E> E unDouble (ArrayList<E> ls) {
        //for(int i=0; i < ls.size(); i++)
        //if(ls.lastIndexOf(ls.get(i))>i)
        for(int i = 0; i < ls.size(); i++){
            if(ls.lastIndexOf(ls.get(i))>i) return ls.get(i);
        }
        return null;
    }
    
    public static <E> ArrayList<E> tousLesDoubles (ArrayList<E> ls){
        //for(int i=0; i < ls.size(); i++)
        //if(ls.lastIndexOf(ls.get(i))>i)
        ArrayList<E> l = new ArrayList<E>();
        for(int i = 0; i < ls.size(); i++){
                if(ls.lastIndexOf(ls.get(i))>i)l.add(ls.get(i));
        }
        return l;
    }
    
    public static <E> ArrayList<E> simplifier (ArrayList<E> ls){
        ArrayList<E> l = new ArrayList<E>();
        for(int i = 0; i < ls.size(); i++){
                if(ls.lastIndexOf(ls.get(i)) == i) l.add(ls.get(i));
        }
        return l;
    }
    
    public static void afficher(ArrayList<String> ls){
        for(String s : ls){
            System.out.println(s);
        }
    }
}
