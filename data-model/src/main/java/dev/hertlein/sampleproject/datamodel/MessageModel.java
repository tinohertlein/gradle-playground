package dev.hertlein.sampleproject.datamodel;

public class MessageModel {
    private final String message;

    public MessageModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}