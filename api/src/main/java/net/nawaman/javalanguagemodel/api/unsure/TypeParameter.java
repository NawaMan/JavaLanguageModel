package net.nawaman.javalanguagemodel.api.unsure;

import net.nawaman.javalanguagemodel.api.Type;

/**
 * Type parameter is a parameter of a type used in the type definition.
 * 
 * Example:
 * 
 * <pre>
 * public class Box&lt;T&gt; {
 * ...
 * }
 * </pre>
 * 
 * <code>T</code> is the type parameter.
 * 
 * Type parameter can have bound.
 **/
public interface TypeParameter {
    String name();
    Bound  bound();
    Type   boundedType();
}
