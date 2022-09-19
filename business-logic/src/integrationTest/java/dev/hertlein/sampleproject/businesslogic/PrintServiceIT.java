package dev.hertlein.sampleproject.businesslogic;


import static org.assertj.core.api.Assertions.assertThat;

import dev.hertlein.sampleproject.datamodel.MessageModel;
import org.junit.jupiter.api.Test;

class PrintServiceIT {

    private PrintService printService = new PrintService();

    @Test
    void should_return_status_done() {
        assertThat(printService.print(new MessageModel("a test"))).isEqualTo("done");
    }
}