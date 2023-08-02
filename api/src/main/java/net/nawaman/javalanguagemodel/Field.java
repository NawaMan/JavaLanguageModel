package net.nawaman.javalanguagemodel;

public interface Field {
    Type          enclosingType();
    String        name();
    Type          type();
    Accessibility accessibility();
    Scope         scope();
    Modifier      modifier();
}
