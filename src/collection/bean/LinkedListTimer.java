package collection.bean;

import collection.bean.ifaces.CollectionTimer;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListTimer implements CollectionTimer {
    private LinkedList<Integer> firstList = new LinkedList<>();
    private Random generator = new Random();

    @Override
    public int getSize() {
        return firstList.size();
    }

    public int addRandom() {
        firstList.add(generator.nextInt());
        return 0;
    }

    @Override
    public void addRandomToIndex(int index) {
        firstList.add(index, generator.nextInt());
    }

    @Override
    public void removeRandomFromIndex(int index) {
        firstList.remove(index);
    }

    @Override
    public void searchRandomFromIndex(int index) {
        firstList.get(index);
    }

    public String toString() {
        return firstList.toString();
    }
}

