package net.nawaman.javalanguagemodel.api.element;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.unsure.ParameterTypes;
import net.nawaman.javalanguagemodel.api.unsure.Parameters;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface Constructor {
    Type                        enclosingType();
    Accessibility               accessibility();
    ParameterTypes              parameterTypes();
    Parameters                  parameters();
    ReadOnlyList<ReferenceType> exceptions();
}
