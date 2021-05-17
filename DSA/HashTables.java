package DSA;


import java.util.LinkedList;

public class HashTables {
    LinkedList<keyValue>[] table = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (table[index] == null)
            table[index] = new LinkedList<>();

        var list = table[index];
        for (var entry : list) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        table[index].addLast(new keyValue(key, value));
    }

    public String get(int key) {
        var index = hash(key);
        var list = table[index];
        for (var pair : list) {
            if (pair.key == key)
                return pair.value;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        var list = table[index];
        for (var pair : list) {
            if (pair.key == key) {
                pair.value = null;
                return;
            }
        }
        throw new IllegalStateException();
    }

    public int hash(int key) {
        return key % table.length;
    }


    private static class keyValue {
        int key;
        String value;

        public keyValue(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }


}
