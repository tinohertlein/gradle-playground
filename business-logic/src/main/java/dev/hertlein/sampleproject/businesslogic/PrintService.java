package dev.hertlein.sampleproject.businesslogic;

import dev.hertlein.sampleproject.datamodel.MessageModel;
import org.apache.commons.lang3.StringUtils;

public class PrintService {

    public void print(MessageModel model) {
        System.out.println(StringUtils.trim(model.getMessage()));
    }
}
