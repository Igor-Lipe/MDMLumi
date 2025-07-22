package br.com.lumimdm.MDM_Lumi.controller;

import br.com.lumimdm.model.Tablet;
import br.com.lumimdm.model.TabletApp;
import br.com.lumimdm.repository.TabletAppRepository;
import br.com.lumimdm.repository.TabletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apps")
public class TabletAppController {

    @Autowired
    private TabletAppRepository tabletAppRepo;

    @Autowired
    private TabletRepository tabletRepo;

    // Adiciona app a todos os tablets de um grupo
    @PostMapping("/instalar-em-grupo")
    public String instalarEmGrupo(@RequestParam String grupo,
                                  @RequestParam String nomeApp,
                                  @RequestParam String pacoteApp,
                                  @RequestParam(required = false) String apkUrl) {

        List<Tablet> tablets = tabletRepo.findByGrupo(grupo.toUpperCase());

        for (Tablet tablet : tablets) {
            TabletApp app = new TabletApp();
            app.setTablet(tablet);
            app.setNomeApp(nomeApp);
            app.setPacoteApp(pacoteApp);
            app.setApkUrl(apkUrl);
            app.setInstalado(false); // ainda não instalado
            tabletAppRepo.save(app);
        }

        return "✅ App '" + nomeApp + "' enviado para todos os tablets do grupo " + grupo;
    }

    // Lista apps de um tablet específico
    @GetMapping("/por-tablet/{id}")
    public List<TabletApp> listarPorTablet(@PathVariable Long id) {
        Tablet tablet = tabletRepo.findById(id).orElseThrow();
        return tabletAppRepo.findByTablet(tablet);
    }
    
    // Atualizar status de instalação (usado pelo app do tablet)
    @PutMapping("/{appId}/status")
    public String atualizarStatus(@PathVariable Long appId,
                                   @RequestParam boolean instalado) {
        TabletApp app = tabletAppRepo.findById(appId).orElseThrow();
        app.setInstalado(instalado);
        tabletAppRepo.save(app);
        return "🔄 Status de instalação atualizado";
    }
}
