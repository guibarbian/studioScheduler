package com.guibarbian.StudioScheduler.mapper;

public interface BaseMapper<Entity, DTO> {
    Entity toEntity(DTO dto);
    DTO toDto(Entity entity);
}
