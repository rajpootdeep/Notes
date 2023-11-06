package com.deep.filim.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.filim.feign.AccountServiceProxy;
import com.deep.filim.model.TheatreWrapper;

@Service
public class SearchService {

	private AccountServiceProxy accountServiceProxy;

	public SearchService(AccountServiceProxy accountServiceProxy) {
		this.accountServiceProxy = accountServiceProxy;
	}

	
	public ResponseEntity<List<TheatreWrapper>> searchByCity(String city){
		
		accountServiceProxy.getAllTheatre();
		if(accountServiceProxy.getAllTheatre().getStatusCode()==200)
			
		return null;
		
	}
}
