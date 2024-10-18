package Faustus.loja_virtual_mentoria.controller;

import Faustus.loja_virtual_mentoria.model.Acesso;
import Faustus.loja_virtual_mentoria.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcessoController {
    @Autowired
    private AcessoService acessoService;

    @PostMapping("/salvarAcesso")
    public Acesso salvarAcesso(Acesso acesso) {
        return acessoService.save(acesso);    
    }
}
