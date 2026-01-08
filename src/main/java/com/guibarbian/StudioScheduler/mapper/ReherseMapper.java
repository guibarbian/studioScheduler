package com.guibarbian.StudioScheduler.mapper;

import org.mapstruct.Mapper;

import com.guibarbian.StudioScheduler.dto.response.ReherseResponseDTO;
import com.guibarbian.StudioScheduler.models.Reherse;

@Mapper(componentModel = "spring")
public interface ReherseMapper extends BaseMapper<Reherse, ReherseResponseDTO>{
}
