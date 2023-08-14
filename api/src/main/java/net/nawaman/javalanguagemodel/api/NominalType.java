package net.nawaman.javalanguagemodel.api;

import lombok.NonNull;
import net.nawaman.javalanguagemodel.api.declaration.TypeDeclaration;

/** Types that are identify by their names. */
public abstract class NominalType extends ReferenceType {
    
    NominalType(@NonNull TypeKind kind) {
        super(kind);
    }
    
    @Override
    public String simpleName() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String fullName() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String rawName() {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Cannot be null but can be empty.
     **/
    @NonNull
    public Generics generics() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public TypeDeclaration definition() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

