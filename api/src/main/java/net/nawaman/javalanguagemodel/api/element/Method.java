package net.nawaman.javalanguagemodel.api.element;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Extensibility;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.ElementScope;
import net.nawaman.javalanguagemodel.api.unsure.ParameterTypes;
import net.nawaman.javalanguagemodel.api.unsure.Parameters;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface Method {
    Type                        enclosingType();
    String                      name();
    Type                        returnType();
    Accessibility               accessibility();
    ElementScope                       scope();
    Extensibility               extensibility();
    ParameterTypes              parameterTypes();
    Parameters                  parameters();
    ReadOnlyList<ReferenceType> exceptions();
}
