package br.com.lumimdm.repository;

import br.com.lumimdm.model.AppPermitido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppPermitidoRepository extends JpaRepository<AppPermitido, Long> {
    List<AppPermitido> findByAtivoTrue(); // para listar apenas os que estão liberados na Play Store
}
