package net.nawaman.javalanguagemodel.api;

import net.nawaman.javalanguagemodel.api.annotationexpression.AnnotationParameters;

public interface Annotation {
    String               name();
    AnnotationParameters parameters();
}
