package net.nawaman.javalanguagemodel.api;

import static net.nawaman.javalanguagemodel.api.TypeKind.Primitive;

import java.util.Objects;

import lombok.NonNull;
import lombok.val;

/** Primitive types are .... primitive types. Nuff said. */
public class PrimitiveType extends Type {
    
    private final String        name;
    private final ReferenceType boxedType;
    
    PrimitiveType(@NonNull String name, @NonNull Class<?> boxedClass) {
        super(Primitive);
        this.name      = name;
        this.boxedType = null; //new BoxedType(boxedClass, this);
    }
    
    @Override
    public String simpleName() {
        return name;
    }
    
    @Override
    public String fullName() {
        return name;
    }
    
    @Override
    public String rawName() {
        return name;
    }
    
    @NonNull
    public final ReferenceType boxedType() {
        return boxedType;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, boxedType);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (obj == null)
            return false;
        
        if (getClass() != obj.getClass())
            return false;
        
        val other = (PrimitiveType) obj;
        return Objects.equals(boxedType, other.boxedType)
            && Objects.equals(name,      other.name);
    }
    
    @Override
    public String toString() {
        return "PrimitiveType [name=" + name + ", boxedType=" + boxedType + "]";
    }
    
}
