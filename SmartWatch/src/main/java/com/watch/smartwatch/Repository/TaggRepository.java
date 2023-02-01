package com.watch.smartwatch.Repository;

import com.watch.smartwatch.Entity.TaggEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaggRepository extends JpaRepository<TaggEntity,Integer> {
}
