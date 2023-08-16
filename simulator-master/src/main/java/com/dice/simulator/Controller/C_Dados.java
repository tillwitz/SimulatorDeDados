package com.dice.simulator.Controller;

import com.dice.simulator.Model.M_Jogada;
import com.dice.simulator.Service.S_Dados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Dados {
    @GetMapping("/")
    public String getDados() {
        return "index";
    }

    @PostMapping("/cadastro")
    public String postDados(@RequestParam("qtd_dados") int qtd_dados,
                            @RequestParam("qtd_faces") int qtd_faces,
                            Model model) {
        M_Jogada jogada = S_Dados.jogarDados(qtd_dados,qtd_faces);

        model.addAttribute("dados", jogada.getDados());
        model.addAttribute("soma", jogada.getSoma());
        model.addAttribute("maximo", jogada.getMaximo());
        return "index";
    }
}
