package com.neri.carapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarroRecordDto(@NotBlank String nomecarro, @NotNull int anofabricacaocarro, @NotNull int anomodelocarro, @NotBlank String modelocarro, @NotNull int idmarca) {
}
