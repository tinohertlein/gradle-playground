package dev.hertlein.sampleproject.app;

import dev.hertlein.sampleproject.businesslogic.PrintService;
import dev.hertlein.sampleproject.datamodel.MessageModel;

public class Application {
    public static void main(String[] args) {
        new PrintService().print(new MessageModel("Hello World"));
    }
}
