package net.nawaman.javalanguagemodel.reflection;

import java.lang.reflect.Modifier;

import lombok.val;
import net.nawaman.javalanguagemodel.api.Accessibility;
import net.nawaman.javalanguagemodel.api.Extensibility;
import net.nawaman.javalanguagemodel.api.Package;
import net.nawaman.javalanguagemodel.api.ReferenceType;
import net.nawaman.javalanguagemodel.api.Type;
import net.nawaman.javalanguagemodel.api.TypeScope;
import net.nawaman.javalanguagemodel.api.declaration.TypeDeclaration;
import net.nawaman.javalanguagemodel.api.unsure.TypeParameter;
import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public class ReflectionType implements ReferenceType {
    
    private final Class<?> clazz;
    
    public ReflectionType(Class<?> clzz) {
        this.clazz = clzz;
    }
    
    @Override
    public String simpleName() {
        return clazz.getSimpleName();
    }
    
    @Override
    public String name() {
        return clazz.getCanonicalName();
    }
    
    @Override
    public Accessibility accessibility() {
        val modifiers = clazz.getModifiers();
        if (java.lang.reflect.Modifier.isPrivate(modifiers)) {
            return Accessibility.Private;
        } else if (java.lang.reflect.Modifier.isProtected(modifiers)) {
            return Accessibility.Protected;
        } else if (java.lang.reflect.Modifier.isPublic(modifiers)) {
            return Accessibility.Public;
        } else {
            return Accessibility.Package;
        }
    }
    
    @Override
    public Extensibility extensibility() {
        if (Modifier.isFinal(clazz.getModifiers())) {
            return Extensibility.Final;
        }
        if (Modifier.isAbstract(clazz.getModifiers())) {
            return Extensibility.Abstract;
        }
        return Extensibility.Overridable;
    }
    
    @Override
    public TypeScope typeScope() {
        if (clazz.getEnclosingClass() == null) {
            return TypeScope.Package;
        }
        if (clazz.isMemberClass() && Modifier.isStatic(clazz.getModifiers())) {
            return TypeScope.Static;
        }
        if (clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers())) {
            return TypeScope.Instance;
        }
        if (clazz.isLocalClass()) {
            return TypeScope.Local;
        } else if (clazz.isAnonymousClass()) {
            return TypeScope.Anonymous;
        } else {
            throw new IllegalStateException("The class is not in any of the expected scope: " + clazz);
        }
    }
    
    @Override
    public Package typePackage() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ReadOnlyList<TypeParameter> parameters() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public TypeDeclaration declaration() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Type enclosingType() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
