package com.ecommerce.demo.dto;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Adresse;
import com.ecommerce.demo.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {

	private String nom;
	
	private String description;
	
	private Adresse adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String steWeb;
	
	private List<UtilisateurDto> utilisateurs;
}
