package br.com.lumimdm.MDM_Lumi.controller;

import br.com.lumimdm.model.AppPermitido;
import br.com.lumimdm.repository.AppPermitidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apps-permitidos")
public class AppPermitidoController {

    @Autowired
    private AppPermitidoRepository repository;

    // Lista todos os apps cadastrados
    @GetMapping
    public List<AppPermitido> listarTodos() {
        return repository.findAll();
    }

    // Lista apenas os apps ativos (whitelist)
    @GetMapping("/ativos")
    public List<AppPermitido> listarAtivos() {
        return repository.findByAtivoTrue();
    }

    // Cadastrar um novo app permitido
    @PostMapping
    public AppPermitido cadastrar(@RequestBody AppPermitido app) {
        return repository.save(app);
    }

    // Atualizar status (ativar/desativar)
    @PutMapping("/{id}/status")
    public AppPermitido alterarStatus(@PathVariable Long id, @RequestParam boolean ativo) {
        return repository.findById(id).map(app -> {
            app.setAtivo(ativo);
            return repository.save(app);
        }).orElseThrow();
    }

    // Deletar app
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
