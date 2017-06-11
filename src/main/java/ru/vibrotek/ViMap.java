package ru.vibrotek;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 */
public class ViMap<K, V> {
    public void put(K key, V measuringNode) {

    }

    public void add(K key, V value) {

    }

    public V remove(K key) {
        return null;
    }

    public boolean containsKey(K key) {
        return false;
    }

    public int size() {
        return 0;
    }

    public Map<K, V> toImmutableMap() {
        return null;
    }

    public void forEachValue(Consumer<V> o) {

    }

    public void forEachKey(Consumer<K> o) {

    }

    public void removeIf(Predicate<V> predicate) {

    }

    public V get(K key) {
        return null;
    }

    public boolean containsValue(V storage) {
        return false;
    }

    public K getKeyByValue(V storage) {
        return null;
    }
}
