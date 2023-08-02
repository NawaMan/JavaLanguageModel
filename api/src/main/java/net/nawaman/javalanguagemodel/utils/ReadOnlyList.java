package net.nawaman.javalanguagemodel.utils;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import lombok.val;

@FunctionalInterface
public interface ReadOnlyList<DATA> extends List<DATA> {
    
    @Override
    public Stream<DATA> stream();
    
    @Override
    public default Iterator<DATA> iterator() {
        return stream().iterator();
    }
    
    // == Access list ==
    @Override
    public default int size() {
        return (int) stream().count();
    }
    
    @Override
    public default boolean isEmpty() {
        return !stream().findAny().isPresent();
    }
    
    @Override
    public default boolean contains(Object o) {
        return stream().filter(each -> Objects.equals(each, o)).findAny().isPresent();
    }
    
    @Override
    public default boolean containsAll(Collection<?> c) {
        return c.stream().allMatch(each -> stream().anyMatch(o -> Objects.equals(each, o)));
    }
    
    @Override
    public default Object[] toArray() {
        return stream().toArray();
    }
    
    @Override
    public default <T> T[] toArray(T[] a) {
        @SuppressWarnings("unchecked")
        IntFunction<T[]> generator = (int i) -> (T[])Array.newInstance(a.getClass().getComponentType(), i);
        return stream().toArray(generator);
    }
    
    public default <A> A[] toArray(IntFunction<A[]> generator) {
        return stream().toArray(generator);
    }
    
    @Override
    public default DATA get(int index) {
        val ref = new AtomicReference<DATA>();
        val found = this.stream().limit(index).findAny().isPresent();
        if (!found)
            throw new IndexOutOfBoundsException("" + index);
        
        return ref.get();
    }
    
    @Override
    public default int indexOf(Object o) {
        return stream().collect(toList()).indexOf(o);
    }
    
    @Override
    public default int lastIndexOf(Object o) {
        return stream().collect(toList()).lastIndexOf(o);
    }
    
    @Override
    public default ListIterator<DATA> listIterator() {
        return stream().collect(toList()).listIterator();
    }
    
    @Override
    public default ListIterator<DATA> listIterator(int index) {
        return stream().collect(toList()).listIterator(index);
    }
    
    @Override
    public default ReadOnlyList<DATA> subList(int fromIndexInclusive, int toIndexExclusive) {
        val length = toIndexExclusive - fromIndexInclusive;
        val subList = stream().skip(fromIndexInclusive).limit(length).collect(toList());
        return (ReadOnlyList<DATA>) (() -> subList.stream());
    }
    
    @Override
    public default Spliterator<DATA> spliterator() {
        val iterator = iterator();
        return Spliterators.spliteratorUnknownSize(iterator, 0);
    }
    
    @Override
    public default void forEach(Consumer<? super DATA> action) {
        if (action == null)
            return;
        stream().forEach(action);
    }
    
    // == Mutable methods are not supported.
    @Override
    public default DATA set(int index, DATA element) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean add(DATA e) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean remove(Object o) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean addAll(Collection<? extends DATA> c) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean addAll(int index, Collection<? extends DATA> c) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean removeAll(Collection<?> c) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default boolean retainAll(Collection<?> c) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default void clear() {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default void add(int index, DATA element) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default DATA remove(int index) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default void replaceAll(UnaryOperator<DATA> operator) {
        throw new ReadOnlyListException(this);
    }
    
    @Override
    public default void sort(Comparator<? super DATA> c) {
        throw new ReadOnlyListException(this);
    }
}
