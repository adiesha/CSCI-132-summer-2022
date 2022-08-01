package org.csci132.summer.week6.lecture1;

import org.csci132.summer.week5.lecture4.Entry;

public interface Map<K, V> {
    int size();

    boolean isEmpty();

    V get(K key);

    V put(K key, V value);

    V remove(K key);

    Iterable<K> keySet();

    Iterable<V> values();

    Iterable<Entry<K, V>> entrySet();
}