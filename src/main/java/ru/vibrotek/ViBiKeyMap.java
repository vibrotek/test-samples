package ru.vibrotek;

import java.util.List;

/**
 * Карта должна хранить в себе только одно значение для пары ключей
 * (key1, key2) - пара ключей определяет уникальность значения (порядок ключей не должен учитываться)
 * для одного ключа может быть много значений
 */
public class ViBiKeyMap<T> {
    public T get(Object key1, Object key2) {
        return null;
    }

    /**
     * Возвращает все значения по одному ключу
     * @param key
     * @return
     */
    public List<T> getValuesByCategory(Object key) {
        return null;
    }

    /**
     * Удаляет все значения к которым ведет ключ
     * @param key
     */
    public void removeByCategoryDeep(Object key) {

    }

    public void add(T value, Object key1, Object key2) {

    }

    public List<T> getAll() {
        return null;
    }

    private int buildSymmetricHash(Object key1, Object key2) {
        return 0;
    }

}
