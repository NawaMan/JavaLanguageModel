package net.nawaman.javalanguagemodel;

/** Primitive types are .... primitive types. Nuff said. */
public class PrimitiveType implements Type {
    
    private final String name;
    
    public PrimitiveType(String name) {
        this.name = name;
    }
    
    public final String name() {
        return name;
    }
    
}
