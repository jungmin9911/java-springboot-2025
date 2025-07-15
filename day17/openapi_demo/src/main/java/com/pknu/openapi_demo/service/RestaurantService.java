package com.pknu.openapi_demo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pknu.openapi_demo.dto.FoodKrResponse;
import com.pknu.openapi_demo.dto.Item;

@Service
public class RestaurantService {

    // OpenAPI 호출
    public List<Item> fetchRestaurants(int pageNo) {
        StringBuffer result = new StringBuffer();

        try {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/6260000/FoodService/getFoodKr");
            urlBuilder.append("?serviceKey=" + "3l%2FV1Hzl5tc8zP1cbyTpG0qoHZTd0ngqiQCvi0Y%2FpAIrpFO3546iPvXSC49KxS5%2BYvVokbzBzL%2F32ysVisJD3Q%3D%3D");
            urlBuilder.append("&pageNo=" + pageNo);
            urlBuilder.append("&numOfRows=" + "10");
            urlBuilder.append("&resultType=json");

            URL url = new URL(urlBuilder.toString());
            // System.out.println(url);     // OpenAPI 확인용
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");   // GET method로 웹사이트 요청

            BufferedReader rd;
            // conn.getResponseCode() 200(OK) 400(NoPage) 500(Server Error)
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            } else {    // 아니면 에러
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line + "\n");
            }

            rd.close();
            conn.disconnect();

            // System.out.println(result.toString());  // 결과 확인용

            // JSON 문자열 파싱
            ObjectMapper mapper = new ObjectMapper();
            FoodKrResponse response = mapper.readValue(result.toString(), FoodKrResponse.class);

            // 리스트에 담아서 리턴
            List<Item> foodList = response.getFoodKr.item;
            return foodList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
