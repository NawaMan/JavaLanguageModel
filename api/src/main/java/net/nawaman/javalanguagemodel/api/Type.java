package net.nawaman.javalanguagemodel.api;

import lombok.NonNull;

/** Type is for variable, fields, method parameters and return type. */
public abstract class Type {
    
    public static final PrimitiveType primitiveChar    = new PrimitiveType("char",    Character.class);
    public static final PrimitiveType primitiveByte    = new PrimitiveType("byte",    Byte.class);
    public static final PrimitiveType primitiveShort   = new PrimitiveType("short",   Short.class);
    public static final PrimitiveType primitiveInt     = new PrimitiveType("int",     Integer.class);
    public static final PrimitiveType primitiveLong    = new PrimitiveType("long",    Long.class);
    public static final PrimitiveType primitiveFloat   = new PrimitiveType("float",   Float.class);
    public static final PrimitiveType primitiveDouble  = new PrimitiveType("double",  Double.class);
    public static final PrimitiveType primitiveBoolean = new PrimitiveType("boolean", Boolean.class);
    public static final PrimitiveType primitiveVoid    = new PrimitiveType("void",    Void.class);
    
    private final TypeKind kind;
    
    Type(@NonNull TypeKind kind) {
        this.kind = kind;
    }
    
    /** @return  the simple name of the type which is the name to use when the type is already imported. */
    public abstract String simpleName();
    
    /** @return  the full name of the type which is the name to use regardless if the type is imported. */
    public abstract String fullName();
    
    /** @return  the raw name of the type but without wildcard (if exists). */
    public abstract String rawName();
    
    public final TypeKind kind() {
        return kind;
    }
    
}
