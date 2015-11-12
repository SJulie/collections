package collection.bean.ifaces;


public interface CollectionTimer {

    int getSize();

    int addRandom();

    void addRandomToIndex(int index);

    void removeRandomFromIndex(int index);

    void searchRandomFromIndex(int index);
}
