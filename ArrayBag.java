/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.bag;
public class ArrayBag<T> implements Bag<T> {
    private T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;          
   
    public int getCurrentSize(){return 0;}
    public boolean isEmpty(){
    if (isArrayFull())return false;
    else
        bag[numberOfEntries ++] = AddNewEntry;
        return true;
        }
    public boolean addNewEntry (T newEntry){return false;}
    public T remove(){return null;}
    public boolean remove (T anEntry){return false;}
    public void clear (){}
    public int getFrequencyOf (T anEntry){return 0;}
    public boolean Contains(T anEntry){return false;}
    public T[] tpArray(){return null;}
    public void display(){} 
    }
    
       

    
