package net.nawaman.javalanguagemodel;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Type is a thing you qualify your parameter, variable, return type, field.
 *
 * 
 * Type can be wildcard...
 * 
 * public List<Number> getNumbers() {...}
 * public List<? super Number> getNumbers() {...}
 * 
 * public <N super Number> List<N> getNumbers() {...}
 * 
 * 
 */

interface Package {
    
}

interface DraftModel {
    
    enum Kind {
        Primitive,
        Parameter,
        Reference
    }
    
    String              name();
    Kind                kind();
    Package             typePackage();
    DraftModel                enclosingType();
    List<TypeParameter> parameters();
    TypeDeclaration     declaration();
    
}

interface PrimitiveType extends DraftModel {
    
}

interface ParameterType extends DraftModel {
    
}

interface ParameterTypes extends List<ParameterType> {
    
}

interface ReferenceType extends DraftModel {
    
}

interface TypeDeclaration {
    DraftModel                  superType();
    List<DraftModel>            interfaces();
    ParameterTypes        parameterTypes();
    List<Field>           fields();
    List<Method>          methods();
    List<InitializeBlock> initializeBlocks();
}

enum Accessibility {
    Private,
    Protected,
    Package,
    Public
}

enum Scope {
    Static,
    Instance
}

enum Concrete {
    Abstract,
    Overridable,
    Final
}

enum Modifier {
    Modifiable,
    Final
}

interface Field {
    DraftModel          enclosingType();
    String        name();
    DraftModel          type();
    Accessibility accessibility();
    Scope         scope();
    Modifier      modifier();
}

interface Method {
    DraftModel                enclosingType();
    String              name();
    DraftModel                returnType();
    Accessibility       accessibility();
    Scope               scope();
    Concrete            concrete();
    ParameterTypes      parameterTypes();
    Parameters          parameters();
    List<ReferenceType> exceptions();
}

interface Constructor {
    DraftModel                enclosingType();
    Accessibility       accessibility();
    ParameterTypes      parameterTypes();
    Parameters          parameters();
    List<ReferenceType> exceptions();
}

interface Expression {
    
}

interface FieldDeclaration {
    TypeDeclaration  enclosingTypeDeclaration();
    String           name();
    DraftModel             type();
    Accessibility    accessibility();
    Scope            scope();
    Modifier         modifier();
    Expression       defaultValue();
    List<Annotation> annotations();
}

interface MethodDeclaration {
    TypeDeclaration       enclosingTypeDeclaration();
    String                name();
    DraftModel                  returnType();
    Accessibility         accessibility();
    Scope                 scope();
    Concrete              concrete();
    ParameterTypes        parameterTypes();
    ParameterDeclarations parameters();
    Set<ReferenceType>    exceptions();
    List<Annotation>      annotations();
}

interface Parameters extends Map<String, DraftModel> {
    
}

interface ParameterDeclaration {
    DraftModel             type();
    List<Annotation> annotations();
}

interface ParameterDeclarations extends Map<String, ParameterDeclaration> {
    
}

interface Annotation {
    String               name();
    AnnotationParameters parameters();
}

interface AnnotationExpression {
}

interface AnnotationParameters extends Map<String, AnnotationExpression> {
    Object value();
}

interface AnnotationPrimitiveExpression extends AnnotationExpression {
    Object value();
}

interface AnnotationStringExpression extends AnnotationExpression {
    String value();
}

interface AnnotationClassExpression extends AnnotationExpression {
    DraftModel value();
}

interface AnnotationEnumExpression extends AnnotationExpression {
    String value();
}

interface AnnotationArrayExpression extends AnnotationExpression {
    List<AnnotationExpression> value();
}

enum Bound {
    Unbound,
    LowerBound,
    Upperbound
}

interface TypeParameter {
    Bound bound();
    DraftModel  boundedType();
}

interface Block {
    
}

interface InitializeBlock extends Block {
    Scope scope();
}

// Expression

interface LiteralExpression {
    // Represents a literal value, such as an integer, floating-point number, boolean, or string. You might have further sub-interfaces or subclasses for each type of literal.
}
interface VariableExpression {
    // Represents a reference to a variable.
}

interface MethodCallExpression {
    // Represents a method call. This might have methods to get the target object (which could be another Expression), the method name, and the arguments (which would be a list of Expression instances).
}

interface ObjectCreationExpression {
    // Represents object creation through a constructor. This might have methods to get the type being constructed and the arguments to the constructor (which would be a list of Expression instances).
}

interface ArrayCreationExpression {
    // Represents the creation of an array. This might have methods to get the element type, the size of the array, and the initial values (which would be a list of Expression instances).
}

interface BinaryExpression {
    // Represents a binary operation like addition or string concatenation. This could have methods to get the left-hand expression, the right-hand expression, and the operator.
}

interface UnaryExpression {
    // Represents a unary operation like negation. This could have methods to get the operand and the operator.
}

interface CastExpression {
    // Represents a type cast. This might have methods to get the type being cast to and the expression being cast.
}

interface ConditionalExpression {
    // Represents a conditional expression (ternary operator ? :). This might have methods to get the condition, the true expression, and the false expression.
}

