package org.misha.serializer;

import com.google.gson.Gson;
import org.misha.domain.Misha;

public class MishaSerializer {
    public String serialize(Misha misha) {
        return new Gson().toJson(misha);
    }
}
