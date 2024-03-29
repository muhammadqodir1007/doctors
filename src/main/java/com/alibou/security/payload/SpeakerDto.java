package com.alibou.security.payload;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class SpeakerDto {


    private int id;
    String fullName;
    String description_uz;
    String description_en;
    String description_ru;
    MultipartFile file;

}
