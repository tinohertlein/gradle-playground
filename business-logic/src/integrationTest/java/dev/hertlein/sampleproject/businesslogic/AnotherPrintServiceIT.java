package dev.hertlein.sampleproject.businesslogic;


import static org.assertj.core.api.Assertions.assertThat;

import dev.hertlein.sampleproject.datamodel.MessageModel;
import org.junit.jupiter.api.Test;

class AnotherPrintServiceIT {

    private AnotherPrintService printService = new AnotherPrintService();

    @Test
    void should_return_status_done() {
        assertThat(printService.print(new MessageModel("a test"))).isEqualTo("done");
    }
}