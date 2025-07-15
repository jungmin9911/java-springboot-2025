package com.pknu.openapi_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pknu.openapi_demo.dto.FoodKrResponse.GetFoodKr;
import com.pknu.openapi_demo.dto.Item;
import com.pknu.openapi_demo.service.RestaurantService;



@Controller
// @RequiredArgsConstructor
@RequestMapping("/busan")
public class RestaurantController {

    // 실제 OpenAPI 로직을 처리할 서비스 선언
    @Autowired
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/foodkr")
    public String showFoodKr(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo, Model model) {
        // RestaurantService 에서 OpenAPI 호출, 데이터 가져옴
        GetFoodKr rtFoodKr = restaurantService.fetchRestaurants(pageNo);
        List<Item> busanFoodList = rtFoodKr.item;
        // List<Item> busanFoodList = restaurantService.fetchRestaurants(pageNo);

        System.out.println(busanFoodList.size());

        // 전체 데이터 수, 페이지 사이즈, 현재 페이지
        int totalCount = rtFoodKr.totalCount;   // 전체 데이터 수 - 현재 437
        int numOfRows = rtFoodKr.numOfRows; // 페이지 사이즈 - 현재 10
        int totalPages = (int) Math.ceil(totalCount / (double) numOfRows); // 437 ÷ 10 올림 => 44

        // 리스트로 받은 다음
        model.addAttribute("busanFoodList", busanFoodList);
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", totalPages);

        // Model로 리스트를 넘김
        return "foodkr";    // templates/foodkr.html 리턴
    }

    @PostMapping("/save_foodkr")
    public String saveToDb(@RequestParam(name = "pageNo") int pageNo, Model model) {
        // 데이터 받아서 저장
        @SuppressWarnings("unused")
        int resultCount = restaurantService.saveRestaurantToDb(pageNo);
        
        return String.format("redirect:/busan/foodkr?pageNo=%s", pageNo);  // templates/resultFoodkr.html
    }
    
    
}
