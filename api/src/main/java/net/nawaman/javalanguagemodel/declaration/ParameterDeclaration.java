package net.nawaman.javalanguagemodel.declaration;

import net.nawaman.javalanguagemodel.Annotation;
import net.nawaman.javalanguagemodel.Type;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface ParameterDeclaration {
    Type             type();
    ReadOnlyList<Annotation> annotations();
}
