package org.misha;

import org.junit.Test;
import org.misha.domain.Misha;
import org.misha.serializer.MishaSerializer;

import static org.junit.Assert.*;

public class MishaSerializerTest {

    @Test
    public void serialize() {
        assertNotNull(new MishaSerializer().serialize(new Misha("misha", null)));
    }
}