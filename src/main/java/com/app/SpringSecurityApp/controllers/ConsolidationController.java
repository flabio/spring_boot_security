package com.app.SpringSecurityApp.controllers;

import com.app.SpringSecurityApp.Service.DAO.IConsolidationServiceDAO;
import com.app.SpringSecurityApp.Service.Impl.ConsolidationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/consolidation")

public class ConsolidationController {
    private final IConsolidationServiceDAO consolidationService;

    @Autowired
    public ConsolidationController(IConsolidationServiceDAO consolidationService){
        this.consolidationService=consolidationService;
    }

    @GetMapping("/get")
    public ResponseEntity<?> index(){
        try{
            Map<String,Object> data =new HashMap<>();
            data.put("data",this.consolidationService.findAll());
            return ResponseEntity.status(HttpStatus.OK).body(data);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
