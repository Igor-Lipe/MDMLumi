package br.com.lumimdm.MDM_Lumi.controller;

import br.com.lumimdm.model.Dispositivo;
import br.com.lumimdm.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    // GET: Teste simples
    @GetMapping("/")
    public String home() {
        return "🚀 API MDM_Lumi rodando com sucesso!";
    }

    // GET: Lista todos os dispositivos
    @GetMapping
    public List<Dispositivo> listarTodos() {
        return dispositivoRepository.findAll();
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public Optional<Dispositivo> buscarPorId(@PathVariable Long id) {
        return dispositivoRepository.findById(id);
    }

    // POST: Cadastrar novo dispositivo
    @PostMapping
    public Dispositivo cadastrar(@RequestBody Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    // PUT: Atualizar dispositivo
    @PutMapping("/{id}")
    public Dispositivo atualizar(@PathVariable Long id, @RequestBody Dispositivo atualizado) {
        return dispositivoRepository.findById(id).map(dispositivo -> {
            dispositivo.setNomeDispositivo(atualizado.getNomeDispositivo());
            dispositivo.setModelo(atualizado.getModelo());
            dispositivo.setImei(atualizado.getImei());
            dispositivo.setSistemaOperacional(atualizado.getSistemaOperacional());
            dispositivo.setStatus(atualizado.getStatus());
            return dispositivoRepository.save(dispositivo);
        }).orElseGet(() -> {
            atualizado.setId(id);
            return dispositivoRepository.save(atualizado);
        });
    }

    // DELETE: Deletar por ID
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        dispositivoRepository.deleteById(id);
    }
}
