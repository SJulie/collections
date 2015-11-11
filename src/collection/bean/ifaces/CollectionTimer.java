package collection.bean.ifaces;


public interface CollectionTimer {

    int getSize();

    void addRandom();

    void addRandomToIndex(int index);

    void removeRandomFromIndex(int index);

    void searchRandomFromIndex(int index);
}
