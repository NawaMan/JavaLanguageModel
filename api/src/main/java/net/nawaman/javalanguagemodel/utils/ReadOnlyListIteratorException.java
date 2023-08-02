package net.nawaman.javalanguagemodel.utils;

import java.util.Objects;

public class ReadOnlyListIteratorException extends UnsupportedOperationException {
    
    private static final long serialVersionUID = -4939246101808788821L;
    
    public ReadOnlyListIteratorException(@SuppressWarnings("rawtypes") ReadOnlyListIterator listIterator) {
        super(message(listIterator));
    }
    
    @SuppressWarnings({ "rawtypes" })
    public static String message(ReadOnlyListIterator listIterator) {
        Objects.requireNonNull(listIterator);
        return listIterator + " is read only.";
    }
    
}
