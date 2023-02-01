package com.example.Mobile.Repository;

import com.example.Mobile.Entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepo extends JpaRepository<MobileEntity ,Integer> {
   MobileEntity getByBrand(String brand);
}
