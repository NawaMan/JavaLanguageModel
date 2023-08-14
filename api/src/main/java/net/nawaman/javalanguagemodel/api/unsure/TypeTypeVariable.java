package net.nawaman.javalanguagemodel.api.unsure;

import net.nawaman.javalanguagemodel.api.TypeKind;
import net.nawaman.javalanguagemodel.api.TypeVariable;
import net.nawaman.javalanguagemodel.utils.Lazy;

public final class TypeTypeVariable extends TypeVariable {
    
    private final Lazy<TypeTypeVariableDefinition> definitionSuppler;
    
    public TypeTypeVariable(String name, Lazy<TypeTypeVariableDefinition> definitionSuppler) {
        super(TypeKind.TypeVariable, name);
        this.definitionSuppler = definitionSuppler;
    }
    
    public TypeTypeVariableDefinition definition() {
        return this.definitionSuppler.value();
    }
    
}
