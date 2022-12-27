package TP7_Java.Exercice0;
import java.util.Random;
/**
 * Décrivez votre classe Triplet ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Triplet<E>
{
    private E element1;
    private E element2;
    private E element3;
    
    public Triplet(E element1, E element2, E element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }
    
    public E getElement1(){
        return this.element1;
    }
    
    public E getElement2(){
        return this.element2;
    }
    
    public E getElement3(){
        return this.element3;
    }
    
    public void setElement1(E e1){
        this.element1 = e1;
    }
    
    public void setElement2(E e2){
        this.element2 = e2;
    }
    
    public void setElement3(E e3){
        this.element3 = e3;
    }
    
    public void randomSwap(){
        int choix = (int)(Math.random()* 2) + 1;
        E temp= this.element1;
        if (choix == 1){
            this.element1 = this.element3;
        } else if (choix == 2){
            this.element3 = this.element2;
        } else {
            this.element2 = temp;
        }
    }
}