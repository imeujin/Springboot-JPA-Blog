package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//어노테이션을 붙이면 스프링이 com.cos.blog 패키지 이하를 스캔해서 파일을 메모리에 new 함.
@RestController 
public class BlogControllerTest {

	//http:/localhost:8085/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
