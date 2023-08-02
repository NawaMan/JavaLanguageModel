package net.nawaman.javalanguagemodel.annotationexpression;

import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface AnnotationArrayExpression extends AnnotationExpression {
    ReadOnlyList<AnnotationExpression> value();
}
