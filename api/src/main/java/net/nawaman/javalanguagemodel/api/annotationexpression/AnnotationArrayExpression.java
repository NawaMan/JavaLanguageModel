package net.nawaman.javalanguagemodel.api.annotationexpression;

import net.nawaman.javalanguagemodel.utils.ReadOnlyList;

public interface AnnotationArrayExpression extends AnnotationExpression {
    ReadOnlyList<AnnotationExpression> value();
}
