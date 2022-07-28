package org.csci132.summer.week5.lecture4;

/**
 * @author : Adiesha
 * @created : 7/25/2022, Monday
 **/
public interface PriorityQueue<K, V> {
    int size();

    boolean isEmpty();

    Entry<K, V> insert(K key, V value) throws IllegalArgumentException;

    Entry<K, V> min();

    Entry<K, V> removeMin();
}
