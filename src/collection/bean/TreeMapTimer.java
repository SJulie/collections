package collection.bean;

import collection.bean.ifaces.CollectionTimer;

import java.util.Random;
import java.util.TreeMap;

public class TreeMapTimer implements CollectionTimer {
    private TreeMap<Integer, Integer> firstMap = new TreeMap<Integer, Integer>();
    private Random generator = new Random();
    int index = 0;


    @Override
    public int getSize() {
        return firstMap.size();
    }

    @Override
    public int addRandom() {
        firstMap.put(index, generator.nextInt());
        index++;
        return 0;
    }

    @Override
    public void addRandomToIndex(int index) {
        firstMap.put(this.index, generator.nextInt());
        this.index++;
    }

    @Override
    public void removeRandomFromIndex(int index) {
        firstMap.remove(index);
    }

    @Override
    public void searchRandomFromIndex(int index) {
        firstMap.containsKey(index);
    }
}