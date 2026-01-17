package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {

    // Duplicate eklenmesini engeller
    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        boolean added = super.add(e);
        Collections.sort(this);
        return added;
    }

    // Listeyi sıralar
    public void sort() {
        Collections.sort(this);
    }

    // Eleman siler ve tekrar sıralar
    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            Collections.sort(this);
        }
        return removed;
    }
    //Workintech upDate
}

