package net.nawaman.javalanguagemodel.api;

import static net.nawaman.javalanguagemodel.api.TestHelper.assertAsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GenericTest {
    
    @Test
    public void testUnbound() {
        assertAsString("?", Generic.unbound().wildcard());
    }
    
    @Test
    public void testUpperbound() {
        assertAsString("?", Generic.upper(null));
    }
    
    @Test
    public void testLowerbound() {
        // TODO
    }
    
}
