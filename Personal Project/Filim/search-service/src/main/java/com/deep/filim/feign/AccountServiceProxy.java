package com.deep.filim.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.deep.filim.model.TheatreWrapper;



@FeignClient(name="account-service")
public interface AccountServiceProxy {

	@GetMapping("/theatre/getAllTheatre")
	public ResponseEntity<List<TheatreWrapper>> getAllTheatre();
}
