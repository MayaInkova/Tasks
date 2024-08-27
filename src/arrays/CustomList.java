package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CustomList<T extends Comparable<T>> {
    private ArrayList<T> list;

    public CustomList() {
        list = new ArrayList<>();
    }

    // Добавя елемент към списъка
    public void addElement(T element) {
        list.add(element);
    }

    // Премахва елемент от списъка
    public boolean removeElement(T element) {
        return list.remove(element);
    }

    // Връща елемент по индекс
    public T getElement(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            throw new IndexOutOfBoundsException("Невалиден индекс: " + index);
        }
    }

    // Намира максималния елемент в списъка
    public T getMax() {
        if (list.isEmpty()) {
            return null;
        }
        return Collections.max(list);
    }

    // Връща размера на списъка
    public int getSize() {
        return list.size();
    }
}


