package br.com.lumimdm.repository;

import br.com.lumimdm.model.TabletApp;
import br.com.lumimdm.model.Tablet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TabletAppRepository extends JpaRepository<TabletApp, Long> {
    List<TabletApp> findByTablet(Tablet tablet);
    List<TabletApp> findByTabletGrupo(String grupo); // para instalar apps em massa
}
