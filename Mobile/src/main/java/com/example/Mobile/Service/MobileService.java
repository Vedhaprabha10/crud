package com.example.Mobile.Service;

import com.example.Mobile.Dto.MobileDto;
import com.example.Mobile.Entity.MobileEntity;

import java.util.List;

public interface MobileService {
    MobileEntity saveDetails(MobileDto mobileDto);
    List<MobileEntity> getAllMobile();

    void delete (Integer id);

    MobileEntity getById(Integer id);

    MobileEntity getByBrand(String brand);
}
