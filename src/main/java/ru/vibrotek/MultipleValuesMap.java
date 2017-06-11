package ru.vibrotek;

import java.util.List;
import java.util.function.Consumer;

/**
 * Карта содержащая в себе множество значений для одного ключа
 */
public class MultipleValuesMap<K, V> {

    public void add(K key, V value) {

    }

    /**
     * Возвращает все значения для ключа
     * @param key
     * @return
     */
    public List<V> getValuesByCategory(K key) {
        return null;
    }

    public boolean containsKey(K key) {
        return false;
    }

    public void remove(K key, V value) {//если список пуск, удалить ключ из карты

    }

    public void removeAll(K key) {

    }

    public void forEachKey(Consumer<K> o) {

    }

    public void forEachValue(Consumer<V> o) {

    }
}
