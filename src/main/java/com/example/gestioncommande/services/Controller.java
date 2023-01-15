package com.example.gestioncommande.services;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commands")
public class Controller {
    private final CmdRepository cmdrepo;
    public Controller(CmdRepository cmdrepo){ this.cmdrepo = cmdrepo; }


    @GetMapping("/allList")
    public List<CommandeEntity> getAll() {
        return cmdrepo.findAll();
    }
    
    @PostMapping("/save")
    public CommandeEntity save(@RequestBody CommandeEntity commande){
        System.out.println(commande.toString());
        return cmdrepo.save(commande);
    }
}
