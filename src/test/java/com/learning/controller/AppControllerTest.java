package com.learning.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {

	@Mock
    private RestTemplate restTemplate;
	
	/**
	 * givenMockingIsDoneByMockito
	 * Get is called
	 * Should return Mocked Object
	 */
	@Test
    public void testAccessAPI() {
		String res="";
        Mockito
          .when(restTemplate.getForEntity(
        	"http://localhost:9090/RestAPIDemo/api/access", String.class))
          .thenReturn(new ResponseEntity<>(res,HttpStatus.OK));
	}       
}
