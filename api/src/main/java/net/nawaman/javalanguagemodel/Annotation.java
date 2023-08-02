package net.nawaman.javalanguagemodel;

import net.nawaman.javalanguagemodel.annotationexpression.AnnotationParameters;

public interface Annotation {
    String               name();
    AnnotationParameters parameters();
}
