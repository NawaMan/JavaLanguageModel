package net.nawaman.javalanguagemodel.declaration;

import net.nawaman.javalanguagemodel.Accessibility;
import net.nawaman.javalanguagemodel.Annotation;
import net.nawaman.javalanguagemodel.Expression;
import net.nawaman.javalanguagemodel.Modifier;
import net.nawaman.javalanguagemodel.Scope;
import net.nawaman.javalanguagemodel.Type;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface FieldDeclaration {
    TypeDeclaration          enclosingTypeDeclaration();
    String                   name();
    Type                     type();
    Accessibility            accessibility();
    Scope                    scope();
    Modifier                 modifier();
    Expression               defaultValue();
    ReadOnlyList<Annotation> annotations();
}
