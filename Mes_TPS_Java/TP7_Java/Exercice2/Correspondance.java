package TP7_Java.Exercice2;
import java.util.ArrayList;
import TP7_Java.Exercice1.Exo1;
/**
 * Décrivez votre classe Correspondance ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Correspondance<K,V>
{
    ArrayList<K> list1;
    ArrayList<V> list2; 
    public Correspondance(){
        this.list1 = new ArrayList<K>();
        this.list2 = new ArrayList<V>();
    }
    
    public Correspondance(ArrayList<K> list1,ArrayList<V> list2){
        this.list1 = Exo1.simplifier(list1);
        this.list2 = list2;
    }
    
    public Correspondance(Correspondance<K,V> c){
        this(c.list1,c.list2);
    }
    
    public boolean existe (K k){
       return (list1.contains(k));
    }
    
    public boolean insere (K k, V v) {
        if(!existe(k)){ 
            list1.add(k);
            list2.add(v);
            return true;
        }
        return false;
    }
    
    public boolean remplace (K k, V v){
        int i = list1.indexOf(k);
        if(existe(k)){
            list2.set(i,v);
            return true;
        }
        return false;
    }
    
    public V get (K k){
        int i = list1.indexOf(k);
        if(existe(k)){
            return list2.get(i);
        }
        return null;
    }
    
    public boolean efface (K k){
        int i = (list1.indexOf(k));
        if(i == -1) return false;
        list1.remove(i);
        list2.remove(i);
        return true;
    }
}