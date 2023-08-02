package net.nawaman.javalanguagemodel.api.declaration;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Annotation;
import net.nawaman.javalanguagemodel.api.Expression;
import net.nawaman.javalanguagemodel.api.Modifier;
import net.nawaman.javalanguagemodel.api.Scope;
import net.nawaman.javalanguagemodel.api.Type;
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
