package net.nawaman.javalanguagemodel;

import net.nawaman.javalanguagemodel.declaration.TypeDeclaration;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

/** This is a reference types or Object types. */
public interface ReferenceType extends Type {
    Accessibility               accessibility();
    Modifier                    modifier();
    String                      simpleName();
    Package                     typePackage();
    ReadOnlyList<TypeParameter> parameters();
    TypeDeclaration             declaration();
    
    Scope               scope();          // null if first level.
    Type                enclosingType();  // null if first level.
}