package com.pknu.openapi_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pknu.openapi_demo.dto.FoodKrResponse.GetFoodKr;
import com.pknu.openapi_demo.service.RestaurantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/busanApi")
public class RestaurantRestController {

    private final RestaurantService restaurantService;

    @GetMapping("/foodkr")
    public GetFoodKr getFoodKrApi(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo) {
        GetFoodKr rtFoodKr = restaurantService.fetchRestaurants(pageNo);

        return rtFoodKr;
    }
    
}
