package com.watch.smartwatch.ServiceImpl;

import com.watch.smartwatch.DTO.TaggDTO;
import com.watch.smartwatch.Entity.TaggEntity;
import com.watch.smartwatch.Repository.TaggRepository;
import com.watch.smartwatch.Service.TaggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaggServiceImpl implements TaggService {
    @Autowired
    TaggRepository taggrepo;
    @Override
    public TaggEntity saveproduct(TaggDTO taggDTO) {
    TaggEntity taggEntity=new TaggEntity();
    taggEntity.setId(taggDTO.getId());
    taggEntity.setModel(taggDTO.getModel());
    taggEntity.setPrice(taggDTO.getPrice());
    taggEntity.setBattery(taggDTO.getBattery());
    taggEntity.setMic(taggDTO.getMic());
    taggEntity.setSpeaker(taggDTO.getSpeaker());
    return taggrepo.save(taggEntity);
    }
    @Override
    public List<TaggEntity> getAll(TaggDTO taggDTO) {
    return taggrepo.findAll();
    }
    @Override
    public void deleteId(Integer id) {
    taggrepo.deleteById(id);
    }
    @Override
    public TaggEntity updateproduct(TaggDTO taggDTO) {
    TaggEntity taggEntity = new TaggEntity();
    taggEntity.setId(taggDTO.getId());
    taggEntity.setModel(taggDTO.getModel());
    taggEntity.setPrice(taggDTO.getPrice());
    taggEntity.setBattery(taggDTO.getBattery());
    taggEntity.setMic(taggDTO.getMic());
    taggEntity.setSpeaker(taggDTO.getSpeaker());
    return taggrepo.save(taggEntity);
    }
}
