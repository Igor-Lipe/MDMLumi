package br.com.lumimdm.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TabletApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Tablet tablet;

    private String nomeApp; // Ex: WhatsApp, Zoom, etc.
    private String pacoteApp; // Ex: com.whatsapp
    private String apkUrl; // onde o .apk pode ser baixado
    private boolean instalado = false;

    private LocalDateTime dataSolicitacao = LocalDateTime.now();

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public String getPacoteApp() {
        return pacoteApp;
    }

    public void setPacoteApp(String pacoteApp) {
        this.pacoteApp = pacoteApp;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public boolean isInstalado() {
        return instalado;
    }

    public void setInstalado(boolean instalado) {
        this.instalado = instalado;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
