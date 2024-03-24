package com.ClientServer.service;

import com.ClientServer.dto.request.MesajRequestDto;
import com.ClientServer.dto.response.MesajResponseDto;
import com.ClientServer.entity.Mesaj;
import com.ClientServer.mapper.MesajMapper;
import com.ClientServer.repository.MesajRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@Slf4j
@RequiredArgsConstructor
public class MesajService {

    private final MesajMapper mesajMapper;
    private final MesajRepository mesajRepository;

    public MesajResponseDto createMesaj(MesajRequestDto requestDto) {
        log.info("create Mesaj with, {}", requestDto);
        Mesaj mesaj = mesajMapper.toEntity(requestDto);
        Mesaj saved = mesajRepository.save(mesaj);
        MesajResponseDto responseDto = mesajMapper.toResponseDto(saved);
        log.info("created Mesaj successfully with, {} ", responseDto);
        return responseDto;
    }

    public MesajResponseDto getMesajById(Integer id){
        log.info("get mesaj by id with, {} " ,id);
        Mesaj mesaj = mesajRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        MesajResponseDto responseDto = mesajMapper.toResponseDto(mesaj);
        log.info("got mesajById successfully with, {}", responseDto);
        return responseDto;
    }

}
