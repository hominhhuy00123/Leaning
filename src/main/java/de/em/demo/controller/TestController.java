package de.em.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.em.demo.req.CommonReq;

@RestController
@RequestMapping("/deem")
public class TestController {
	@GetMapping("/test")
	public ResponseEntity<?> test1() {
		return new ResponseEntity<>("This is method GET", HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/test")
	public ResponseEntity<?> test2(@RequestBody CommonReq req) {
		// Get data
		String type = req.getType();
		String value = req.getValue();		
		String msg = "This is method POST" + type + value;
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@PutMapping("/test")
	public ResponseEntity<?> test3() {
		return new ResponseEntity<>("This is method PUT", HttpStatus.OK);
	}

	@PatchMapping("/test")
	public ResponseEntity<?> test4() {
		return new ResponseEntity<>("This is method PATCH", HttpStatus.OK);
	}

	@DeleteMapping("/test")
	public ResponseEntity<?> test5() {
		return new ResponseEntity<>("This is method DELETE", HttpStatus.OK);
	}
}
