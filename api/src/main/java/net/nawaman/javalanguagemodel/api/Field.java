package net.nawaman.javalanguagemodel.api;

public interface Field {
    Type          enclosingType();
    String        name();
    Type          type();
    Accessibility accessibility();
    Scope         scope();
    Modifier      modifier();
}
