package org.misha.serializer;

import com.google.gson.Gson;
import org.misha.Serializer;
import org.misha.domain.MishaResponse;
import org.springframework.stereotype.Component;

@Component
public class MishaSerializer implements Serializer<MishaResponse> {
    private static final Gson gson = new Gson();

    public String serialize(MishaResponse mishaResponse) {
        return gson.toJson(mishaResponse);
    }
}
