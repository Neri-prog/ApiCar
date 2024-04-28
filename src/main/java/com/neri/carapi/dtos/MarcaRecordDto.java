package com.neri.carapi.dtos;

import jakarta.validation.constraints.NotBlank;

public record MarcaRecordDto(@NotBlank String nomemarca) {
}
