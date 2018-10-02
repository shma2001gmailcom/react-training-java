package org.misha.impl;

import org.misha.MishaService;
import org.misha.domain.Misha;
import org.misha.serializer.MishaSerializer;
import org.springframework.stereotype.Component;

@Component
public class MishaServiceImpl implements MishaService {

    @Override
    public String getMisha(String value) {
        Misha misha = new Misha();
        if ("misha".equalsIgnoreCase(value)) {
            misha.setName(value + " is a misha.");
        } else {
            misha.setName(value + " isn't a misha. This is some other client!");
        }
        return new MishaSerializer().serialize(misha);
    }
}
