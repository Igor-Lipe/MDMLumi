package br.com.lumimdm.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dispositivos")
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDispositivo;
    private String modelo;
    private String imei;
    private String sistemaOperacional;
    private String status;

    private LocalDateTime dataRegistro = LocalDateTime.now();

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nomeDispositivo
	 */
	public String getNomeDispositivo() {
		return nomeDispositivo;
	}

	/**
	 * @param nomeDispositivo the nomeDispositivo to set
	 */
	public void setNomeDispositivo(String nomeDispositivo) {
		this.nomeDispositivo = nomeDispositivo;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the imei
	 */
	public String getImei() {
		return imei;
	}

	/**
	 * @param imei the imei to set
	 */
	public void setImei(String imei) {
		this.imei = imei;
	}

	/**
	 * @return the sistemaOperacional
	 */
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	/**
	 * @param sistemaOperacional the sistemaOperacional to set
	 */
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the dataRegistro
	 */
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro the dataRegistro to set
	 */
	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
    
}
