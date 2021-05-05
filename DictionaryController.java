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
public class DictionaryController {

    
    ArrayList<dictionary> inventory = new ArrayList<dictionary>(
            Arrays.asList(
                    new dictionary(null, "","")
            ));

    private dictionary find(Integer id) {

        return inventory.stream()
                .filter(i -> id.equals(i.getId()))
                .findAny()
                .orElse(null);
    }

    @GetMapping("/items")
    public ArrayList<dictionary> getInventory() {

        return inventory;
    }
}
