package com.ClientServer.mapper;

import com.ClientServer.dto.request.MesajRequestDto;
import com.ClientServer.dto.response.MesajResponseDto;
import com.ClientServer.entity.Mesaj;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy =ReportingPolicy.IGNORE,
        componentModel = "spring")
public interface MesajMapper {

    Mesaj toEntity(MesajRequestDto requestDto);

    MesajResponseDto toResponseDto(Mesaj mesaj);

}
