package net.nawaman.javalanguagemodel;

/** Type is for variable, fields, method parameters and return type */
public interface Type {
    
    /** char primitive type */
    public static final PrimitiveType CHR = new PrimitiveType("char");
    
    /** byte primitive type */
    public static final PrimitiveType BYT = new PrimitiveType("byte");
    
    /** short primitive type */
    public static final PrimitiveType SHRT = new PrimitiveType("short");
    
    /** int primitive type */
    public static final PrimitiveType INT = new PrimitiveType("int");
    
    /** long primitive type */
    public static final PrimitiveType LNG = new PrimitiveType("long");
    
    /** float primitive type */
    public static final PrimitiveType FLT = new PrimitiveType("float");
    
    /** double primitive type */
    public static final PrimitiveType DBL = new PrimitiveType("double");
    
    /** boolean primitive type */
    public static final PrimitiveType BOOL = new PrimitiveType("boolean");
    
    /** void primitive type */
    public static final PrimitiveType VOID = new PrimitiveType("void");
    
    
    String name();
    
}
