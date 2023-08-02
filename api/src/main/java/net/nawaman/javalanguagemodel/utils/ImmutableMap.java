package net.nawaman.javalanguagemodel.utils;

import static java.util.Collections.unmodifiableMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ImmutableMap<KEY, VALUE> implements ReadOnlyMap<KEY, VALUE> {
    
    private final Map<KEY, VALUE> map;
    
    public ImmutableMap(Map<KEY, VALUE> map) {
        this.map = unmodifiableMap(new LinkedHashMap<>(map));
    }
    
    @Override
    public int size() {
        return map.size();
    }
    
    @Override
    public Set<KEY> keySet() {
        return map.keySet();
    }
    
    @Override
    public Collection<VALUE> values() {
        return map.values();
    }
    
    @Override
    public Set<Entry<KEY, VALUE>> entrySet() {
        return map.entrySet();
    }
    
    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }
    
    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }
    
    @Override
    public VALUE get(Object key) {
        return map.get(key);
    }
    
    @Override
    public VALUE getOrDefault(Object key, VALUE defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }
    
    @Override
    public void forEach(BiConsumer<? super KEY, ? super VALUE> action) {
        map.forEach(action);
    }
    
}
