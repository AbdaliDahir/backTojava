package com.ecommerce.demo.dto;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Adresse;
import com.ecommerce.demo.model.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {

	private String nom;
	
	private String prenom;
	
	private Adresse adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	private List<CommandeFournisseurDto> commandeFournisseurs;
}
