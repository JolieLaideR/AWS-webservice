package org.example.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDTOTest {

    @Test
    public void lombok_Test() {
        String name = "Test";
        int amount = 1000;

        HelloReponseDTO dto = new HelloReponseDTO(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
