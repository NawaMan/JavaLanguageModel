package net.nawaman.javalanguagemodel;

import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface Constructor {
    Type                        enclosingType();
    Accessibility               accessibility();
    ParameterTypes              parameterTypes();
    Parameters                  parameters();
    ReadOnlyList<ReferenceType> exceptions();
}
