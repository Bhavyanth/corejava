package com.rewards.users.utils;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		
		switch (response.status()) {
		case 400:
			
			break;
		case 404:
			if(methodKey.contains("checkaccess")) {
				
			}
			//return new custom exception 
			break;
		default:
			break;
		}
		
		return null;
	}

}
