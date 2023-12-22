package edu.kh.todo.main;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController = @Controller + @ResponseBody
// json 형태로 객체 데이터 반환
public class MainController {
	
	@GetMapping("/getPortNumber")
	public List<String> getPortNumber(){
		return Arrays.asList("서버포트는 8080","리액트 포트 : 3000");
				
	}
	
	
	@PostMapping("/getUserInfo")
	public String getUserInfo(@RequestBody HashMap<String, Object> map) {
		System.out.println("map : " + map);
		String message = "메시지가 없습니다";
		
		if(map.get("name").equals("홍길동") && map.get("age").equals(20)) {
			message = "홍길동입니다";
		}
		
		return message;
	}
}
