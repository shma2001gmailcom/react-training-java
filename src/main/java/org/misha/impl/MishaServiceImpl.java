package org.misha.impl;

import org.misha.MishaService;
import org.misha.Serializer;
import org.misha.domain.Misha;
import org.misha.domain.MishaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MishaServiceImpl implements MishaService {
    private final Serializer<MishaResponse> serializer;

    @Autowired
    public MishaServiceImpl(Serializer<MishaResponse> serializer) {
        this.serializer = serializer;
    }

    @Override
    public MishaResponse response(String value) {
        return new MishaResponse(new Misha(value), "igor".equalsIgnoreCase(value)
                                          ? " is an Igor."
                                          : " isn't an Igor. This is some other client!");
    }
}
