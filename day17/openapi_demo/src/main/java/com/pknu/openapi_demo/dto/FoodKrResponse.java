package com.pknu.openapi_demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodKrResponse {

    @JsonProperty("getFoodKr")  // JSON으로 조회했을 때 제일 위에 안고있는 값(?)
    public GetFoodKr getFoodKr; // 최종 인스턴스 선언

    public static class GetFoodKr {
        public Header header;
        // item은 리스트
        public List<Item> item;
        public int numOfRows;
        public int pageNo;
        public int totalCount;
    }

    public static class Header {
        public String code;
        public String message;
    }
}
