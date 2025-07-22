package br.com.lumimdm.repository;

import br.com.lumimdm.model.Tablet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TabletRepository extends JpaRepository<Tablet, Long> {
    List<Tablet> findByGrupo(String grupo); // Para buscar tablets por grupo (ex: A, B, C)
}
