package com.ClientServer.dto.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MesajResponseDto {

    private Integer id;
    private String text;
    private Date createdAt;

}
