package net.nawaman.javalanguagemodel.api.declaration;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Extensibility;
import net.nawaman.javalanguagemodel.api.Package;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.TypeScope;
import net.nawaman.javalanguagemodel.api.element.Field;
import net.nawaman.javalanguagemodel.api.element.Method;
import net.nawaman.javalanguagemodel.api.unsure.InitializeBlock;
import net.nawaman.javalanguagemodel.api.unsure.ParameterTypes;
import net.nawaman.javalanguagemodel.api.unsure.TypeParameter;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

/** This present a declaration of type. */
public interface TypeDeclaration {
    String                      simpleName();
    String                      fullName();
    
    Accessibility  accessibility();
    Extensibility  extensibility();
    Package        typePackage();
    TypeDeclaration declaration();
    
    TypeScope     typeScope();
    ReferenceType enclosingType();
    
    ReadOnlyList<TypeParameter> parameters();
    
    Type                          superType();
    ReadOnlyList<Type>            interfaces();
    ParameterTypes                parameterTypes();
    ReadOnlyList<Field>           fields();
    ReadOnlyList<Method>          methods();
    ReadOnlyList<InitializeBlock> initializeBlocks();
}