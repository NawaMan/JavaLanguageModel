package net.nawaman.javalanguagemodel.api.unsure;

import net.nawaman.javalanguagemodel.api.TypeKind;
import net.nawaman.javalanguagemodel.api.TypeVariable;
import net.nawaman.javalanguagemodel.utils.Lazy;

public final class MethodTypeVariable extends TypeVariable {
    
    private final Lazy<MethodTypeVariableDefinition> definitionSuppler;
    
    public MethodTypeVariable(String name, Lazy<MethodTypeVariableDefinition> definitionSuppler) {
        super(TypeKind.MethodVariable, name);
        this.definitionSuppler = definitionSuppler;
    }
    
    public MethodTypeVariableDefinition definition() {
        return this.definitionSuppler.value();
    }
    
}
