package net.nawaman.javalanguagemodel.declaration;

import net.nawaman.javalanguagemodel.Accessibility;
import net.nawaman.javalanguagemodel.Field;
import net.nawaman.javalanguagemodel.InitializeBlock;
import net.nawaman.javalanguagemodel.Method;
import net.nawaman.javalanguagemodel.Modifier;
import net.nawaman.javalanguagemodel.Package;
import net.nawaman.javalanguagemodel.ParameterTypes;
import net.nawaman.javalanguagemodel.Scope;
import net.nawaman.javalanguagemodel.Type;
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