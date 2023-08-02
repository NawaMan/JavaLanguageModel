package net.nawaman.javalanguagemodel.api;

/** This is a type that is local to a type or a method. */
public interface ParameterType extends Type {
    
    Type boundedType();
    Type enclosingType();
    
}