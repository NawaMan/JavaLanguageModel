package net.nawaman.javalanguagemodel.api.declaration;

import java.util.Set;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Annotation;
import net.nawaman.javalanguagemodel.api.Concrete;
import net.nawaman.javalanguagemodel.api.ParameterTypes;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Scope;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface MethodDeclaration {
    TypeDeclaration       enclosingTypeDeclaration();
    String                name();
    Type                  returnType();
    Accessibility         accessibility();
    Scope                 scope();
    Concrete              concrete();
    ParameterTypes        parameterTypes();
    ParameterDeclarations parameters();
    Set<ReferenceType>    exceptions();
    ReadOnlyList<Annotation>      annotations();
}
