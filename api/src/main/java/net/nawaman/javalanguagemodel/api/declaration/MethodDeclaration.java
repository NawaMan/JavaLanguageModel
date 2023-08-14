package net.nawaman.javalanguagemodel.api.declaration;

import java.util.Set;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Extensibility;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.ElementScope;
import net.nawaman.javalanguagemodel.api.unsure.Annotation;
import net.nawaman.javalanguagemodel.api.unsure.ParameterTypes;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface MethodDeclaration {
    TypeDeclaration           enclosingTypeDeclaration();
    String                   name();
    Type                     returnType();
    Accessibility            accessibility();
    ElementScope                    scope();
    Extensibility            extensibility();
    ParameterTypes           parameterTypes();
    ParameterDeclarations    parameters();
    Set<ReferenceType>       exceptions();
    ReadOnlyList<Annotation> annotations();
}
