package com.sample.sampledata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	@GetMapping("/te")
	public String t() {
		return "hello world";
	}
}
