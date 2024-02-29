package com.example.Sortilegios.Weasley.Web.Controller;

import com.example.Sortilegios.Weasley.Domain.Dto.Witcher;
import com.example.Sortilegios.Weasley.Domain.Service.WitcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/witcher")
public class WitcherController {

    private final WitcherService witcherService;

    @Autowired
    public WitcherController(WitcherService witcherService) {
        this.witcherService = witcherService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Witcher>> getAll(){
        return ResponseEntity.ok(witcherService.getAll());
    }

}
