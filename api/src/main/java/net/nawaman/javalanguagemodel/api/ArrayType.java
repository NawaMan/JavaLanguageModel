package net.nawaman.javalanguagemodel.api;

import lombok.NonNull;

/** Types for array. */
public class ArrayType extends ReferenceType {
    
    private final ReferenceType componentType;
    
    public ArrayType(@NonNull ReferenceType componentType) {
        super(TypeKind.Array);
        this.componentType = componentType;
    }
    
    public final ReferenceType componentType() {
        return componentType;
    }
    
    @Override
    public String simpleName() {
        return componentType.simpleName() + "[]";
    }
    
    @Override
    public String fullName() {
        return componentType.fullName() + "[]";
    }
    
    @Override
    public String rawName() {
        return componentType.rawName() + "[]";
    }
    
}
