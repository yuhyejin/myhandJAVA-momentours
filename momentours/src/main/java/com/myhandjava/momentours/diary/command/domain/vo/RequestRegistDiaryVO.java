package com.myhandjava.momentours.diary.command.domain.vo;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RequestRegistDiaryVO {
    private String diaryContent;
    private LocalDateTime diaryCreateDate;
    private int diaryUserNo;
    private int coupleNo;

    List<MultipartFile> files;
}
