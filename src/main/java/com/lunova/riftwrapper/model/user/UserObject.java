package com.lunova.riftwrapper.model.user;

import java.util.*;

public class UserObject {
    public static class ListProxy<T> extends UserObject implements List<T> {
        private final List<T> data = new ArrayList<>();

        @Override
        public int size() {
            return data.size();
        }

        @Override
        public boolean isEmpty() {
            return data.isEmpty();
        }

        @Override
        public boolean contains(Object o) {
            return data.contains(o);
        }

        @Override
        public Iterator<T> iterator() {
            return data.iterator();
        }

        @Override
        public Object[] toArray() {
            return data.toArray();
        }

        @Override
        public <T1> T1[] toArray(T1[] a) {
            return data.toArray(a);
        }

        @Override
        public boolean add(T t) {
            return data.add(t);
        }

        @Override
        public boolean remove(Object o) {
            return data.remove(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return data.containsAll(c);
        }

        @Override
        public boolean addAll(Collection<? extends T> c) {
            return data.addAll(c);
        }

        @Override
        public boolean addAll(int index, Collection<? extends T> c) {
            return data.addAll(index, c);
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return data.removeAll(c);
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return data.retainAll(c);
        }

        @Override
        public void clear() {
            data.clear();
        }

        @Override
        public T get(int index) {
            return data.get(index);
        }

        @Override
        public T set(int index, T element) {
            return data.set(index, element);
        }

        @Override
        public void add(int index, T element) {
            data.add(index, element);
        }

        @Override
        public T remove(int index) {
            return data.remove(index);
        }

        @Override
        public int indexOf(Object o) {
            return data.indexOf(o);
        }

        @Override
        public int lastIndexOf(Object o) {
            return data.lastIndexOf(o);
        }

        @Override
        public ListIterator<T> listIterator() {
            return data.listIterator();
        }

        @Override
        public ListIterator<T> listIterator(int index) {
            return data.listIterator(index);
        }

        @Override
        public List<T> subList(int fromIndex, int toIndex) {
            return data.subList(fromIndex, toIndex);
        }
    }

    public static class SetProxy<T> extends UserObject implements Set<T> {
        private final Set<T> data = new HashSet<>();

        @Override
        public int size() {
            return data.size();
        }

        @Override
        public boolean isEmpty() {
            return data.isEmpty();
        }

        @Override
        public boolean contains(Object o) {
            return data.contains(o);
        }

        @Override
        public Iterator<T> iterator() {
            return data.iterator();
        }

        @Override
        public Object[] toArray() {
            return data.toArray();
        }

        @Override
        public <T1> T1[] toArray(T1[] a) {
            return data.toArray(a);
        }

        @Override
        public boolean add(T t) {
            return data.add(t);
        }

        @Override
        public boolean remove(Object o) {
            return data.remove(o);
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return data.containsAll(c);
        }

        @Override
        public boolean addAll(Collection<? extends T> c) {
            return data.addAll(c);
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return data.retainAll(c);
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return data.removeAll(c);
        }

        @Override
        public void clear() {
            data.clear();
        }
    }
}
