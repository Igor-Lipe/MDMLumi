package br.com.lumimdm.repository;

import br.com.lumimdm.model.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
    // Aqui você pode adicionar métodos de busca personalizados depois
}
