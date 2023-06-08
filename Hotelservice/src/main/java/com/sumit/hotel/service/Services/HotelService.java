package com.sumit.hotel.service.Services;

import com.sumit.hotel.service.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);

}
