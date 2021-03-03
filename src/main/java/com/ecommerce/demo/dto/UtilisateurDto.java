package com.ecommerce.demo.dto;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Adresse;
import com.ecommerce.demo.model.Entreprise;
import com.ecommerce.demo.model.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

	private String nom;
	
	private String prenom;
	
	private String email;
	
	private Instant dateDeNaissance;
	
	private String moteDePasse;
	
	private Adresse adresse;
	
	private String photo;
	
	private String numTel;
	
	private EntrepriseDto entreprise;
	
	private List<RolesDto> roles;
}
