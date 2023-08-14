package net.nawaman.javalanguagemodel.api;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

import lombok.val;
import net.nawaman.javalanguagemodel.utils.ImmutableList;

/**
 * List of generics.
 **/
public final class Generics extends ImmutableList<Generic> {
    
    @SafeVarargs
    public Generics(Generic ... elements) {
        this(Arrays.asList(elements));
    }
    
    public Generics(List<Generic> list) {
        super(list);
    }
    
    public String generic() {
        val genetic
                = stream()
                .map    (Generic::wildcard)
                .collect(joining(","));
        return genetic;
    }
    
}
