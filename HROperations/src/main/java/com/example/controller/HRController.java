package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HR;
import com.example.service.HRService;



@RestController
@RequestMapping("/hr_welcome")
public class HRController 
{
	@Autowired
    private HRService service;

    @PostMapping("/addHR")
    public HR addHr(@RequestBody HR hr) {
        return service.saveHr(hr);
    }

    @PostMapping("/addHRs")
    public List<HR> addHRs(@RequestBody List<HR> hrs) {
        return service.saveHrs(hrs);
    }

    @GetMapping("/hrs")
    public List<HR> findAllHrs() {
        return service.getHrs();
    }

    @GetMapping("/hrById/{id}")
    public HR findHrById(@PathVariable int id) {
        return service.getHrById(id);
    }

    @GetMapping("/hr/{name}")
    public HR findHrByName(@PathVariable String name) {
       return service.getHrByName(name);
    }

    @PutMapping("/update")
    public HR updateHr(@RequestBody HR hr) {
        return service.updateHr(hr);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHr(@PathVariable int id) {
        return service.deleteHr(id);
    }
}
