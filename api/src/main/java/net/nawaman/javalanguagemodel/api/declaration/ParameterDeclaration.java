package net.nawaman.javalanguagemodel.api.declaration;

import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.unsure.Annotation;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface ParameterDeclaration {
    Type             type();
    ReadOnlyList<Annotation> annotations();
}
