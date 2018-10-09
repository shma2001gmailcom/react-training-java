package org.misha;

import org.junit.Test;
import org.misha.domain.Misha;
import org.misha.domain.MishaResponse;
import org.misha.serializer.MishaSerializer;

import static org.junit.Assert.assertNotNull;

public class MishaSerializerTest {

    @Test
    public void serialize() {
        System.out.println(new MishaSerializer().serialize(new MishaResponse(new Misha("misha"), "***")));
        assertNotNull(new MishaSerializer().serialize(new MishaResponse(new Misha("misha"), null)));
    }
}