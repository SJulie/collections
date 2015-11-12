package collection;

import collection.bean.*;
import collection.bean.ifaces.CollectionTimer;
import java.time.Duration;
import java.time.Instant;

public class TimeCompare {
    public static void main(String args[]) {

        ArrayListTimer arrayListTimer = new ArrayListTimer();
        System.out.println("ArrayList:");
        System.out.println("Создание 10000 элементов: " + getCreationTime(arrayListTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину списка: " + getAddingTime(arrayListTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины списка: " + getRemovingTime(arrayListTimer, 10000));
        System.out.println("Поиск элемента в середине списка: " + getSearchingTime(arrayListTimer, 10000));
        System.out.println();

        LinkedListTimer linkedListTimer = new LinkedListTimer();
        System.out.println("LinkedList:");
        System.out.println("Создание 10000 элементов: " + getCreationTime(linkedListTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину списка: " + getAddingTime(linkedListTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины списка: " + getRemovingTime(linkedListTimer, 10000));
        System.out.println("Поиск элемента в середине списка: " + getSearchingTime(linkedListTimer, 10000));
        System.out.println();

        HashSetTimer hashSetTimer = new HashSetTimer();
        System.out.println("HashSet::");
        System.out.println("Создание 10000 элементов: " + getCreationTime(hashSetTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину множества: " + getAddingTime(hashSetTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины множества: " + getRemovingTime(hashSetTimer, 10000));
        System.out.println("Поиск элемента в середине множества: " + getSearchingTime(hashSetTimer, 10000));
        System.out.println();

        TreeSetTimer treeSetTimer = new TreeSetTimer();
        System.out.println("TreeSet::");
        System.out.println("Создание 10000 элементов: " + getCreationTime(treeSetTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину множества: " + getAddingTime(treeSetTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины множества: " + getRemovingTime(treeSetTimer, 10000));
        System.out.println("Поиск элемента в середине множества: " + getSearchingTime(treeSetTimer, 10000));
        System.out.println();

        HashMapTimer hashMapTimer = new HashMapTimer();
        System.out.println("HashMap::");
        System.out.println("Создание 10000 элементов: " + getCreationTime(hashMapTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину множества: " + getAddingTime(hashMapTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины множества: " + getRemovingTime(hashMapTimer, 10000));
        System.out.println("Поиск элемента в середине множества: " + getSearchingTime(hashMapTimer, 10000));
        System.out.println();

        TreeMapTimer treeMapTimer = new TreeMapTimer();
        System.out.println("TreeMap::");
        System.out.println("Создание 10000 элементов: " + getCreationTime(treeMapTimer, 10000));
        System.out.println("Добавление 10000 элементов в середину множества: " + getAddingTime(treeMapTimer, 10000));
        System.out.println("Удаление 10000 элементов из середины множества: " + getRemovingTime(treeMapTimer, 10000));
        System.out.println("Поиск элемента в середине множества: " + getSearchingTime(treeMapTimer, 10000));
        System.out.println();
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
            instance.addRandomToIndex(instance.getSize() / 2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

    private static Duration getRemovingTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.removeRandomFromIndex(instance.getSize() / 2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

    private static Duration getSearchingTime(CollectionTimer instance, int count) {
        Instant start = Instant.now();
        for (int i = 0; i < count; i++) {
            instance.searchRandomFromIndex(instance.getSize() / 2);
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }

}
