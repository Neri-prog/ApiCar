package com.neri.carapi.dtos;

import jakarta.validation.constraints.NotBlank;

public record CarroRecordDto(@NotBlank String nomecarro, @NotBlank int anofabricacaocarro, @NotBlank int anomodelocarro, @NotBlank String modelocarro) {
}
