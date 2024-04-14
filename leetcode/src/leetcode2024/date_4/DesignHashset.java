package leetcode2024.date_4;

import java.util.Iterator;
import java.util.LinkedList;

public class DesignHashset {
    public static void main(String[] args) {

    }
    private LinkedList[] linkedList;
    private static Integer BASE=678;

    public DesignHashset(){
        linkedList=new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            linkedList[i]=new LinkedList();
        }
    }
    public void add(int key) {
        int h=hash(key);
        Iterator<Integer> iterator = linkedList[h].iterator();
        while (iterator.hasNext()){
            Integer next =  iterator.next();
            if (next == key) {
                return;
            }
        }
        linkedList[h].offerLast(key);
    }

    public void remove(int key) {
        int h=hash(key);
        Iterator<Integer> iterator = linkedList[h].iterator();
        while (iterator.hasNext()){
            if(iterator.next() == key){
                linkedList[h].remove(Integer.valueOf(key));
                return;
            }
        }

    }

    public boolean contains(int key) {
        int h=hash(key);
        Iterator<Integer> iterator = linkedList[h].iterator();
        while (iterator.hasNext()){
            if(iterator.next() == key){
                return true;
            }
        }
        return false;
    }

    public static int hash(int key){
        return key%BASE;
    }
}
