package com.jm1109.spring03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // '이제부터 SpringBoot에서 컨트롤러로 동작'이라고 지칭해주는 주석(어노테이션)
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @GetMapping("/hello") // 웹서비스에서 사용할 길을 하나 만들 거야. 길 이름은 "/hello"
    // 'hello'라는 길(Path)로 들어오면 아래 메소드를 실행하라
    @ResponseBody
    public String helloSpring() {   // 길(Path)을 만들어주기 전까지 사용 불가
        logger.info("hello URL 오픈");
        // 문제 발생시 로그를 남길떄
        logger.debug("디버그시 필요한 로그입니다");
        logger.trace("디버그시 필요한 로그예요");

        logger.warn("경고표시를 나타내는 로그입니다");
        logger.error("에러표시를 나타내는 로그입니다");

        return "Hello SpringBoot!";
    }
}
