package net.nawaman.javalanguagemodel;

import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface Method {
    Type                        enclosingType();
    String                      name();
    Type                        returnType();
    Accessibility               accessibility();
    Scope                       scope();
    Concrete                    concrete();
    ParameterTypes              parameterTypes();
    Parameters                  parameters();
    ReadOnlyList<ReferenceType> exceptions();
}
