package com.example.portalend;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CoupangAPIService {
    private static final String COUPANG_API_URL = "https://api.coupang.com";

    public CoupangResponse getProductDetails(String sellerProductId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = COUPANG_API_URL + "/v2/providers/seller_api/apis/api/v1/marketplace/seller-products/{sellerProductId}";

        // Path Variable 설정
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("sellerProductId", sellerProductId);

        // API 호출
        ResponseEntity<CoupangResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, CoupangResponse.class, pathVariables);

        // 응답 결과 반환
        return responseEntity.getBody();
    }
}
