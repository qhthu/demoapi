package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class DictionaryController {

    @Autowired
    private DictionaryRepository dictionaryRepository;

    @GetMapping("/dictionary")
    public List<dictionary> getAll() {
        return dictionaryRepository.findAll();
    }

    @Test
    public void testCreateUser() {
        dictionary d = new dictionary();
        d.setEn("hello");
        d.setVi("xin chao");
        dictionaryRepository.save(d);

    }
}
