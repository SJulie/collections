package collection.bean;

import collection.bean.ifaces.CollectionTimer;

import java.util.HashMap;
import java.util.Random;

public class HashMapTimer implements CollectionTimer{
    private HashMap<Integer, Integer> firstList = new HashMap<>();
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
