package collection;

import collection.bean.ArrayListTimer;
import collection.bean.LinkedListTimer;
import collection.bean.ifaces.CollectionTimer;

import java.time.Duration;
import java.time.Instant;

public class TimeCompare {
    public static void main(String args[]) {
        ArrayListTimer arrayListTimer = new ArrayListTimer();

        System.out.println(getCreationTime(arrayListTimer, 10000));
        System.out.println(getAddingTime(arrayListTimer, 10000));
        System.out.println(getRemovingTime(arrayListTimer, 10000));
        System.out.println(getSearchingTime(arrayListTimer, 10000));
        System.out.println();

        LinkedListTimer linkedListTimer = new LinkedListTimer();
        System.out.println(getCreationTime(linkedListTimer, 10000));
        System.out.println(getAddingTime(linkedListTimer, 10000));
        System.out.println(getRemovingTime(linkedListTimer, 10000));
        System.out.println(getSearchingTime(linkedListTimer, 10000));
    }

    private static Duration getCreationTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.addRandom();
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

    private static Duration getAddingTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.addRandomToIndex(instance.getSize()/2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

    private static Duration getRemovingTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.removeRandomFromIndex(instance.getSize()/2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

    private static Duration getSearchingTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.searchRandomFromIndex(instance.getSize()/2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

}
