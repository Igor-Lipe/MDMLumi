package br.com.lumimdm.MDM_Lumi.controller;

import br.com.lumimdm.model.AppPermitido;
import br.com.lumimdm.repository.AppPermitidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AppPermitidoRepository appPermitidoRepository;

    // Exibe a página apps.jsp
    @GetMapping("/apps/formulario")
    public String exibirFormulario(Model model) {
        List<AppPermitido> apps = appPermitidoRepository.findAll();
        model.addAttribute("appsPermitidos", apps);
        return "apps"; // Vai procurar em: /WEB-INF/jsp/apps.jsp
    }
}
