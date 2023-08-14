package net.nawaman.javalanguagemodel.api.declaration;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Modifiability;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.ElementScope;
import net.nawaman.javalanguagemodel.api.unsure.Annotation;
import net.nawaman.javalanguagemodel.api.unsure.Expression;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface FieldDeclaration {
    TypeDeclaration          enclosingTypeDeclaration();
    String                   name();
    Type                     type();
    Accessibility            accessibility();
    ElementScope                    scope();
    Modifiability                 modifier();
    Expression               defaultValue();
    ReadOnlyList<Annotation> annotations();
}
