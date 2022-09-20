package dev.hertlein.playground.gradle.businesslogic

import dev.hertlein.playground.gradle.datamodel.MessageModel
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory

class AnotherPrintService {

    private val logger = LoggerFactory.getLogger(PrintService::class.java)

    fun print(model: MessageModel): String {
        logger.warn(StringUtils.trim(model.message))
        return "done"
    }
}