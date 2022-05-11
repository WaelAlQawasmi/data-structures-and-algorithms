package hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hashtable<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;
    List<K> keysList;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public List<K> keys() {
        return keysList;
    }


    public Hashtable() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        // init bucket array to prevent index out of
        // bounds exception for first time insert / retrieval
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }


    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    /*
    This is the hashing logic which produces\
    a unique array index to do inserts and
    lookups
     */
    private int hash(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;
        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;
        return arrayIndex;
    }


    public void set(K key, V value) {
        keysList.add(key);

        int index = hash(key);
        int hashcode = hashCode(key);


        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);


        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }


    // Returns value for a key
    public V get(K key) {
        // Find head of chain for given key
        int index = hash(key);
        int keyHash = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);


        while (head != null) {
            if (head.getKey().equals(key) && head.hashCode() == keyHash)
                return head.getValue();
            head = head.getNext();
        }


        return null;
    }


    public boolean contains(K key) {

        int index = hash(key);
        int keyHash = hashCode(key);
        HashNode<K, V> head = bucketArray.get(index);
        while (head != null) {
            if (head.getKey().equals(key) && head.hashCode() == keyHash) {
                return true;
            }

            head = head.getNext();
        }

        return false;
    }


}
