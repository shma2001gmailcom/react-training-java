package org.misha.impl;

import org.misha.MishaService;
import org.misha.Serializer;
import org.misha.domain.Misha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MishaServiceImpl implements MishaService {
    private final Serializer<Misha> serializer;

    @Autowired
    public MishaServiceImpl(Serializer<Misha> serializer) {
        this.serializer = serializer;
    }

    @Override
    public String getMisha(String value) {
        return serializer.serialize(new Misha(value, "igor".equalsIgnoreCase(value)
                                                     ? " is an Igor."
                                                     : " isn't an Igor. This is some other client!"));
    }
}
