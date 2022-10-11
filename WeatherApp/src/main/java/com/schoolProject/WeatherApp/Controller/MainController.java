package com.schoolProject.WeatherApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MainController {

	@GetMapping("/")
	public Object sentWeatherDetails() {
		String key = "f2f60a03ac3c42ff946111149221110";
		String city = "London";
		String uri ="http://api.weatherapi.com/v1/current.json?key= "+key+"&q="+city+"&aqi=no";
		RestTemplate rest = new RestTemplate();
		Object result = rest.getForObject(uri, Object.class);
		return result;
	}
	@GetMapping("/api")
	public Object sentForCastDetails() {
		String key = "f2f60a03ac3c42ff946111149221110";
		String city = "London";
		String uri ="http://api.weatherapi.com/v1/forecast.json?key= "+key+"&q="+city+"&aqi=no";
		RestTemplate rest = new RestTemplate();
		Object result = rest.getForObject(uri, Object.class);
		return result;
	}
}
