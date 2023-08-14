package net.nawaman.javalanguagemodel.utils;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import lombok.NonNull;
import lombok.val;

public class Lazy<TYPE> {
    
    private final Supplier<TYPE> supplier;
    
    public Lazy(@NonNull Supplier<TYPE> supplier) {
        val dummy     = new Object();
        val reference = new AtomicReference<Object>();
        this.supplier = () -> {
            if (reference.compareAndSet(null, dummy)) {
                try {
                    val value = supplier.get();
                    reference.set((Supplier<TYPE>)(()->value));
                } catch (RuntimeException e) {
                    reference.set(e);
                }
            }
            while (!(reference.get() instanceof Supplier)) {
                if (reference.get() instanceof RuntimeException)
                    throw (RuntimeException)reference.get();
            }
            
            @SuppressWarnings("unchecked")
            val valueSupplier = (Supplier<TYPE>)reference.get();
            return valueSupplier.get();
        };
    }
    
    public final TYPE value() {
        return supplier.get();
    }
    
}
