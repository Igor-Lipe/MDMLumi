package br.com.lumimdm.MDM_Lumi.controller;

import br.com.lumimdm.model.TabletApp;
import br.com.lumimdm.repository.TabletAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tablet-apps")
public class DispositivoAppController {

    @Autowired
    private TabletAppRepository tabletAppRepository;

    @GetMapping
    public List<TabletApp> listarTodos() {
        return tabletAppRepository.findAll();
    }

    @PostMapping
    public TabletApp vincularApp(@RequestBody TabletApp tabletApp) {
        return tabletAppRepository.save(tabletApp);
    }
}
