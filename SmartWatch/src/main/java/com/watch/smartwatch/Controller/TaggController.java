package com.watch.smartwatch.Controller;

import com.watch.smartwatch.DTO.TaggDTO;
import com.watch.smartwatch.Entity.TaggEntity;
import com.watch.smartwatch.Service.TaggService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tagg")
public class TaggController {
    @Autowired
    TaggService taggService;
    @PostMapping("/save")
    public ResponseEntity<?> saveproduct(@RequestBody TaggDTO taggDTO){
    TaggEntity tagg =taggService.saveproduct(taggDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(tagg);
    }
    @GetMapping("/getall")
    public ResponseEntity<List<TaggEntity>> getAll(@RequestBody TaggDTO taggDTO){
    List<TaggEntity> taggEntity=taggService.getAll(taggDTO);
    return ResponseEntity.status(HttpStatus.FOUND).body(taggEntity);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
    taggService.deleteId(id);
    }
    @PostMapping("/update")
    public ResponseEntity<?> updateprodut(@RequestBody TaggDTO taggDTO){
    TaggEntity updatetagg=taggService.updateproduct(taggDTO);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(updatetagg);
    }
}
