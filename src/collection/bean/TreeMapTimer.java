package collection.bean;

import collection.bean.ifaces.CollectionTimer;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapTimer implements CollectionTimer {
    private TreeMap<Integer, Integer> firstList = new TreeMap<>();
    private Random generator = new Random();

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void addRandom() {

    }

    @Override
    public void addRandomToIndex(int index) {

    }

    @Override
    public void removeRandomFromIndex(int index) {

    }

    @Override
    public void searchRandomFromIndex(int index) {

    }
}