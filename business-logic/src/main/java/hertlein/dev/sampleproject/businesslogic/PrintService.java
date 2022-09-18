package hertlein.dev.sampleproject.businesslogic;

import hertlein.dev.sampleproject.datamodel.MessageModel;
import org.apache.commons.lang3.StringUtils;

public class PrintService {

    public void print(MessageModel model) {
        System.out.println(StringUtils.trim(model.getMessage()));
    }
}
