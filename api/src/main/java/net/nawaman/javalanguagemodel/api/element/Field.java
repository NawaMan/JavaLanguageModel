package net.nawaman.javalanguagemodel.api.element;

import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Modifiability;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.ElementScope;

public interface Field {
    Type          enclosingType();
    String        name();
    Type          type();
    Accessibility accessibility();
    ElementScope         scope();
    Modifiability modifier();
}
