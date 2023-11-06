package com.deep.filim.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "booking-service")
public interface BookingServiceProxy {

}
