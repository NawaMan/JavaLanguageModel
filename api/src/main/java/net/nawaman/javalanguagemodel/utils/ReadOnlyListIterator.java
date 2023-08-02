package net.nawaman.javalanguagemodel.utils;

import java.util.ListIterator;

public class ReadOnlyListIterator<DATA> implements ListIterator<DATA> {
    
    private final ListIterator<DATA> listIterator;
    
    ReadOnlyListIterator(ListIterator<DATA> listIterator) {
        this.listIterator = listIterator;
    }
    
    @Override
    public boolean hasNext() {
        return listIterator.hasNext();
    }
    
    @Override
    public DATA next() {
        return listIterator.next();
    }
    
    @Override
    public boolean hasPrevious() {
        return listIterator.hasPrevious();
    }
    
    @Override
    public DATA previous() {
        return listIterator.previous();
    }
    
    @Override
    public int nextIndex() {
        return listIterator.nextIndex();
    }
    
    @Override
    public int previousIndex() {
        return listIterator.previousIndex();
    }
    
    @Override
    public void remove() {
        throw new ReadOnlyListIteratorException(this);
    }
    
    @Override
    public void set(DATA e) {
        throw new ReadOnlyListIteratorException(this);
    }
    
    @Override
    public void add(DATA e) {
        throw new ReadOnlyListIteratorException(this);
    }
    
}
