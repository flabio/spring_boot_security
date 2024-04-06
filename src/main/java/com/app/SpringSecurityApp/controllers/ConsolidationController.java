package com.app.SpringSecurityApp.controllers;

import com.app.SpringSecurityApp.Service.DAO.IConsolidationServiceDAO;
import com.app.SpringSecurityApp.dto.ConsolidationDTO;
import com.app.SpringSecurityApp.util.ConstantMenssages;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/consolidation")
@PreAuthorize("denyAll()")
public class ConsolidationController {
    private final IConsolidationServiceDAO consolidationService;

    @Autowired
    public ConsolidationController(IConsolidationServiceDAO consolidationService){
        this.consolidationService=consolidationService;
    }

    @GetMapping("/get")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> index(){
        try{
            Map<String,Object> data =new HashMap<>();
            data.put("data",this.consolidationService.findAll());
            return ResponseEntity.status(HttpStatus.OK).body(data);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @GetMapping("/find_by_id/{id}")
    @PreAuthorize("hasRole('DEVELOPER')")
    public ResponseEntity<?> findBydId(@PathVariable Long id){
        try{
            Map<String,Object> data = new HashMap<>();
            data.put("data",this.consolidationService.findConsolidationById(id));
            return ResponseEntity.status(HttpStatus.OK).body(data);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN') or hasRole('DEVELOPER')")
    public ResponseEntity<?> create(@RequestBody @Valid ConsolidationDTO consolidationDTO){
        try {
            Map<String, Object> data = new HashMap<>();
            if (this.consolidationService.save(consolidationDTO)){
                data.put("message", ConstantMenssages.SUCCESS_CREATE);
                return ResponseEntity.status(HttpStatus.CREATED).body(data);
            }
            data.put("message", ConstantMenssages.ERROR_SAVE);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @PutMapping("/update/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('DEVELOPER')")
    public ResponseEntity<?>update(@PathVariable Long id, @RequestBody @Valid ConsolidationDTO consolidationDTO){
        try{
            Map<String,Object> data=new HashMap<>();
            if(this.consolidationService.update(consolidationDTO,id)){
                data.put("message", ConstantMenssages.SUCCESS_UPDATE);
                return ResponseEntity.status(HttpStatus.CREATED).body(data);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(data);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            Map<String,Object> data = new HashMap<>();
            if(this.consolidationService.delete(id)){
                data.put("message",ConstantMenssages.SUCCESS_DELETE);
                return ResponseEntity.status(HttpStatus.OK).body(data);
            }
            data.put("message",ConstantMenssages.ERROR_DELETE);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
