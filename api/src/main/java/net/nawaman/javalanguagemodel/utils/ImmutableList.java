package net.nawaman.javalanguagemodel.utils;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ImmutableList<DATA> implements ReadOnlyList<DATA> {
    
    private final List<DATA> list;
    
    @SafeVarargs
    public ImmutableList(DATA ... elements) {
        this(Arrays.asList(elements));
    }
    
    public ImmutableList(List<DATA> list) {
        this.list = (list == null)
                  ? emptyList()
                  : new ArrayList<>(list);
    }
    
    @Override
    public Stream<DATA> stream() {
        return list.stream();
    }
    
    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }
    
    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }
    
    @Override
    public ListIterator<DATA> listIterator() {
        return new ReadOnlyListIterator<>(list.listIterator());
    }
    
    @Override
    public ListIterator<DATA> listIterator(int index) {
        return new ReadOnlyListIterator<>(list.listIterator(index));
    }
    
}
