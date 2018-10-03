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
        Misha misha = new Misha();
        if ("misha".equalsIgnoreCase(value)) {
            misha.setName(value + " is a misha.");
        } else {
            misha.setName(value + " isn't a misha. This is some other client!");
        }
        return serializer.serialize(misha);
    }
}
