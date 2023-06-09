package com.kbstar.marker;

import com.kbstar.dto.MarkerSearch;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SearchTest {
    @Autowired
    MarkerService service;
    @Test
    void contextLoads() {
        try {
            MarkerSearch ms = new MarkerSearch(null,null);
            service.search(ms);
        } catch (Exception e) {
            log.info("에러..");
            //e.printStackTrace();
        }
    }

}
