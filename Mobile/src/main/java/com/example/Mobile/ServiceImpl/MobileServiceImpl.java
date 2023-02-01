package com.example.Mobile.ServiceImpl;

import com.example.Mobile.Dto.MobileDto;
import com.example.Mobile.Entity.MobileEntity;
import com.example.Mobile.Repository.MobileRepo;
import com.example.Mobile.Service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileServiceImpl implements MobileService {
    @Autowired
    MobileRepo mobileRepo;
    @Override
    public MobileEntity saveDetails(MobileDto mobileDto) {
    MobileEntity mobile = new MobileEntity();
    mobile.setId(mobileDto.getId());
    mobile.setBrand(mobileDto.getBrand());
    mobile.setModel(mobileDto.getModel());
    mobile.setRam(mobileDto.getRam());
    mobile.setStorage(mobileDto.getStorage());
    mobile.setFront(mobileDto.getFront());
    mobile.setBack(mobileDto.getBack());
    mobile.setBattery(mobileDto.getBattery());
    mobile.setOs(mobileDto.getOs());
    return mobileRepo.save(mobile);
    }

    @Override
    public List<MobileEntity> getAllMobile() {
        return mobileRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
    mobileRepo.deleteById(id);
    }

    @Override
    public MobileEntity getById(Integer id) {
    Optional<MobileEntity> mobile = mobileRepo.findById(id);
    return mobile.get();
    }

    @Override
    public MobileEntity getByBrand(String brand) {
    MobileEntity mobile = mobileRepo.getByBrand(brand);
        return mobile ;
    }


}
