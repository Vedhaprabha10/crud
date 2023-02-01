package com.example.Mobile.Controller;

import com.example.Mobile.Dto.MobileDto;
import com.example.Mobile.Entity.MobileEntity;
import com.example.Mobile.Service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mobile")
public class MobileController {
@Autowired
    MobileService mobileService;
    @PostMapping("/add")
    public ResponseEntity<?> saveDetails(@RequestBody MobileDto mobileDto){
    MobileEntity mobile= mobileService.saveDetails(mobileDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(mobile);
    }
    @GetMapping("/getall")
    public ResponseEntity<?> getAllDetails(){
    List<MobileEntity> mobile = mobileService.getAllMobile();
    return ResponseEntity.status(HttpStatus.OK).body(mobile);
    }
    @DeleteMapping("delete/{id}")
    public void deleteId(@PathVariable Integer id){
        mobileService.delete(id);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
    MobileEntity mobile =mobileService.getById(id);
    return ResponseEntity.status(HttpStatus.OK).body(mobile);
    }
    @GetMapping("get1/{brand}")
    public ResponseEntity<?> getByBrand(@PathVariable String brand){
    MobileEntity mobile = mobileService.getByBrand(brand);
    return ResponseEntity.status(HttpStatus.OK).body(mobile);
    }
}
