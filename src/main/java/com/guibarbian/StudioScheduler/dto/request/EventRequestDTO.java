package com.guibarbian.StudioScheduler.dto.request;

import java.time.LocalDate;

public record EventRequestDTO(
    String title,
    String description,
    LocalDate dateStart,
    LocalDate dateFinish,
    String status
) {
    
}
