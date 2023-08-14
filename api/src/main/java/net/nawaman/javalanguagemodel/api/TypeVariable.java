package net.nawaman.javalanguagemodel.api;

import lombok.NonNull;

public abstract class TypeVariable extends Type {
    
    private final String name;
    
    TypeVariable(@NonNull TypeKind kind, @NonNull String name) {
        super(kind);
        this.name = name;
    }
    
    @Override
    public final String simpleName() {
        return name;
    }
    
    @Override
    public final String fullName() {
        return name;
    }
    
    @Override
    public final String rawName() {
        return name;
    }
    
}
