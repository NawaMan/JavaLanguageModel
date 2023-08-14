package net.nawaman.javalanguagemodel.api;

/**
 * Generic is part of a type also known as "wildcard".
 **/
public class Generic {
    
    /**
     * The type of bounding for this generic.
     */
    public static enum Bound {
        /** This generic has no bound (<code>?</code>) */
        Unbound,
        /** This generic has a lower bound (<code>? super SomeType</code>) */
        LowerBound,
        /** This generic has an upper bound (<code>? extends SomeType</code>) */
        Upperbound
    }
    
}
