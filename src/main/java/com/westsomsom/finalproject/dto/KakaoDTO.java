package com.westsomsom.finalproject.dto;

import lombok.Builder;
import lombok.Data;
//완료
@Builder
@Data
public class KakaoDTO {
    private long id;
    private String email;
    private String nickname;
}
