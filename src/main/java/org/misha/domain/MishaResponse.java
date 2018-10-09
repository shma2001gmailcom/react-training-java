package org.misha.domain;

public class MishaResponse {
    private final Misha misha;
    private final String message;

    public MishaResponse(Misha misha, String message) {
        this.misha = misha;
        this.message = message;
    }
}
