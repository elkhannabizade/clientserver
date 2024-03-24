package com.ClientServer.controller;

import com.ClientServer.dto.request.MesajRequestDto;
import com.ClientServer.dto.response.MesajResponseDto;
import com.ClientServer.service.MesajService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mesaj")
@RequiredArgsConstructor
@RestController
public class MesajController {

    private final MesajService mesajService;

    @PostMapping
    public MesajResponseDto createMesaj(@RequestBody MesajRequestDto requestDto){
        return mesajService.createMesaj(requestDto);
    }

    @GetMapping
    public MesajResponseDto getMesaj(@RequestParam Integer id){
        return mesajService.getMesajById(id);
    }

}
