package com.pknu.backboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pknu.backboard.entity.About;
import com.pknu.backboard.service.AboutService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/intro")
@Controller
@RequiredArgsConstructor
public class IntroController {
    
    private final AboutService aboutService;

    @GetMapping("/about")
    public String aboutPage(Model model) {
        // DB에서 동적으로 들고올 데이터 가져오기
        About about = aboutService.getAbout();

        model.addAttribute("about", about);
        return "intro/about"; // intro/about.html 리턴
    }
    
    @GetMapping("/admissions")
    public String admissionPage() {
        // Static 페이지로 대체

        return "intro/admissions";  // intro/admissions.html 리턴
    }

    @GetMapping("/academics")
    public String academicsPage() {
        // Static 페이지로 대체

        return "intro/academics";  // intro/admissions.html 리턴
    }

    @GetMapping("/events")
    public String eventsPage() {
        // Static 페이지로 대체

        return "intro/events";  // intro/admissions.html 리턴
    }

    @GetMapping("/contact")
    public String contactPage() {
        // Static 페이지로 대체

        return "intro/contact";  // intro/admissions.html 리턴
    }
}
