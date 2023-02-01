package com.watch.smartwatch.Service;

import com.watch.smartwatch.DTO.TaggDTO;
import com.watch.smartwatch.Entity.TaggEntity;

import java.util.List;

public interface TaggService {
    TaggEntity saveproduct(TaggDTO taggDTO);

    List<TaggEntity> getAll(TaggDTO taggDTO);

    void deleteId(Integer id);
    TaggEntity updateproduct(TaggDTO taggDTO);
}
