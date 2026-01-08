package com.guibarbian.StudioScheduler.dto.response;

import java.time.LocalDate;

public record ReherseResponseDTO(
    Long id,
    String title,
    String description,
    LocalDate dateStart,
    LocalDate dateFinish,
    String status,
    Integer numberOfMics,
    String band
) {
    
}
