package com.ClientServer.mapper;

import com.ClientServer.dto.request.MesajRequestDto;
import com.ClientServer.dto.response.MesajResponseDto;
import com.ClientServer.entity.Mesaj;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T16:49:14+0300",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.6.jar, environment: Java 21.0.2 (Amazon.com Inc.)"
)
@Component
public class MesajMapperImpl implements MesajMapper {

    @Override
    public Mesaj toEntity(MesajRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Mesaj mesaj = new Mesaj();

        return mesaj;
    }

    @Override
    public MesajResponseDto toResponseDto(Mesaj mesaj) {
        if ( mesaj == null ) {
            return null;
        }

        MesajResponseDto mesajResponseDto = new MesajResponseDto();

        return mesajResponseDto;
    }
}
