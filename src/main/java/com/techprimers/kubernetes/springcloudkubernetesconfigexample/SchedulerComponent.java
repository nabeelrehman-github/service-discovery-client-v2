package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SchedulerComponent {

//    @Autowired
//    WelcomeConfiguration config;

	@Autowired
	RestTemplate restTemplate;

	@Scheduled(fixedDelay = 10000)
	public void schedule() {
//        System.out.println(config.getMessage());

//		RequestHeaders requestBody = new RequestHeaders();
//		requestBody.setAppversion("");
//		requestBody.setBuildid("");
//		requestBody.setCsvsegmentid("");
//		requestBody.setCustomerid("");
//		requestBody.setParentmsisdn("923058652178");
//		requestBody.setMsisdn("923058652178");
//		requestBody.setLanguage(1);
//		requestBody.setChannel("android");
//		requestBody.setIsguest(false);
//		requestBody.setType("prepaid");

		String url = "http://magento-service:8080/magento_service/get/eligiblewidgets/1";

		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

		System.out.println("Calling via Discovery Client.... " + responseEntity.getBody().toString());
	}
}
