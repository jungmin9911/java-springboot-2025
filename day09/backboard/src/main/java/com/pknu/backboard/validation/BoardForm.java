package com.pknu.backboard.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardForm {

    @Size(max = 250)
    // @NotEmpty(message = "제목은 필수입니다")    // 스페이스바도 입력으로 인식해서 이거 쓰면 안 됨
    @NotBlank(message = "제목은 필수입니다")
    private String title;

    // @NotEmpty(message = "내용은 필수입니다")     // 마찬가지로 스페이스바를 입력으로 인식
    @NotBlank(message = "내용은 필수입니다")
    private String content;
}
