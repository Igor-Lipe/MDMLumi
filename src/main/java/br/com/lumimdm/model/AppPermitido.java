package br.com.lumimdm.model;

import jakarta.persistence.*;

@Entity
public class AppPermitido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeApp;     // Ex: "YouTube"
    private String pacoteApp;   // Ex: "com.google.android.youtube"
    private boolean ativo = true; // se está liberado para alunos
    
 // Getters e Setters
    
	/**
	 * @return the nomeApp
	 */
	public String getNomeApp() {
		return nomeApp;
	}
	/**
	 * @param nomeApp the nomeApp to set
	 */
	public void setNomeApp(String nomeApp) {
		this.nomeApp = nomeApp;
	}
	/**
	 * @return the pacoteApp
	 */
	public String getPacoteApp() {
		return pacoteApp;
	}
	/**
	 * @param pacoteApp the pacoteApp to set
	 */
	public void setPacoteApp(String pacoteApp) {
		this.pacoteApp = pacoteApp;
	}
	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}
	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
