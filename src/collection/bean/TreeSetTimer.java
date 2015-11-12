package collection.bean;

import collection.bean.ifaces.CollectionTimer;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetTimer implements CollectionTimer {
    private TreeSet<Integer> firstSet = new TreeSet<>();
    private Random generator = new Random();

    @Override
    public int getSize() {
        return firstSet.size();
    }

    @Override
    public int addRandom() {
        firstSet.add(generator.nextInt());
        return 0;
    }

    @Override
    public void addRandomToIndex(int index) {
        firstSet.add(index);
    }

    @Override
    public void removeRandomFromIndex(int index) {
        firstSet.remove(index);
    }

    @Override
    public void searchRandomFromIndex(int index) {
        firstSet.contains(index);
    }
}
