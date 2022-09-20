package dev.hertlein.playground.gradle.businesslogic;


import static org.assertj.core.api.Assertions.assertThat;

import dev.hertlein.playground.gradle.datamodel.MessageModel;
import org.junit.jupiter.api.Test;

class PrintServiceTest {

    private final PrintService printService = new PrintService();

    @Test
    void should_return_status_done() {
        assertThat(printService.print(new MessageModel("a test"))).isEqualTo("done");
    }
}