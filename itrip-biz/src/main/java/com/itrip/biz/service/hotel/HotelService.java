package com.itrip.biz.service.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

public interface HotelService {
    /**
     * 查询所有旅店
     * @return
     */
    List<Hotel> getHotels();
}
