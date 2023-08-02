package net.nawaman.javalanguagemodel.declaration;

import java.util.Set;

import net.nawaman.javalanguagemodel.Accessibility;
import net.nawaman.javalanguagemodel.Annotation;
import net.nawaman.javalanguagemodel.Concrete;
import net.nawaman.javalanguagemodel.ParameterTypes;
import net.nawaman.javalanguagemodel.ReferenceType;
import net.nawaman.javalanguagemodel.Scope;
import net.nawaman.javalanguagemodel.Type;
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
