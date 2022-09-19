package dev.hertlein.sampleproject.businesslogic;

import dev.hertlein.sampleproject.datamodel.MessageModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintService {

    private static Logger logger = LoggerFactory.getLogger(PrintService.class);

    public String print(MessageModel model) {
        logger.info(StringUtils.trim(model.getMessage()));
        return "done";
    }
}
