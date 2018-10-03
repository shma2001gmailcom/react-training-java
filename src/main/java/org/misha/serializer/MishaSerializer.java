package org.misha.serializer;

import com.google.gson.Gson;
import org.misha.Serializer;
import org.misha.domain.Misha;
import org.springframework.stereotype.Component;

@Component
public class MishaSerializer implements Serializer<Misha> {
    public String serialize(Misha misha) {
        return new Gson().toJson(misha);
    }
}
