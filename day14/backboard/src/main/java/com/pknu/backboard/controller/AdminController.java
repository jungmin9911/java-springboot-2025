package com.pknu.backboard.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pknu.backboard.entity.About;
import com.pknu.backboard.service.AboutService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AboutService aboutService;

    @GetMapping("/manage")
    public String managePage(About about) {
        About opAbout = aboutService.getAbout();
        about.setTitle(opAbout.getTitle());
        about.setSubtitle(opAbout.getSubtitle());
        about.setOurMission(opAbout.getOurMission());
        about.setOurVision(opAbout.getOurVision());
        about.setSchoolImgPath(opAbout.getSchoolImgPath());
        return "admin/manage";
    }

    @PostMapping("/about")
    public String postAbout(About about, Principal principal) {
        About orignAbout = aboutService.getAbout();

        orignAbout.setTitle(about.getTitle());
        orignAbout.setSubtitle(about.getSubtitle());
        orignAbout.setOurMission(about.getOurMission());
        orignAbout.setOurVision(about.getOurVision());
        orignAbout.setSchoolImgPath(about.getSchoolImgPath());

        aboutService.putAbout(orignAbout);
        
        return "redirect:/admin/manage";
    }
    
    
}
