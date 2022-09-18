package hertlein.dev.sampleproject.app;

import hertlein.dev.sampleproject.businesslogic.PrintService;
import hertlein.dev.sampleproject.datamodel.MessageModel;

public class Application {
    public static void main(String[] args) {
        new PrintService().print(new MessageModel("Hello World"));
    }
}
