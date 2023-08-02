package net.nawaman.javalanguagemodel.api.declaration;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Field;
import net.nawaman.javalanguagemodel.api.InitializeBlock;
import net.nawaman.javalanguagemodel.api.Method;
import net.nawaman.javalanguagemodel.api.Modifier;
import net.nawaman.javalanguagemodel.api.Package;
import net.nawaman.javalanguagemodel.api.ParameterTypes;
import net.nawaman.javalanguagemodel.api.Scope;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

/** This present a declaration of type. */
public interface TypeDeclaration {
    String                        simpleName();
    Package                       typePackage();
    Type                          superType();
    ReadOnlyList<Type>            interfaces();
    ParameterTypes                parameterTypes();
    ReadOnlyList<Field>           fields();
    ReadOnlyList<Method>          methods();
    ReadOnlyList<InitializeBlock> initializeBlocks();
    Accessibility                 accessibility();
    Modifier                      modifier();
    Scope                         scope();
    Type                          enclosingType();
}