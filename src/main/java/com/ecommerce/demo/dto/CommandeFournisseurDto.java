package com.ecommerce.demo.dto;

import java.time.Instant;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Fournisseur;
import com.ecommerce.demo.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {

	private String code;
	
	private Instant dateCommande;
	

	private FournisseurDto fournisseure;
	
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}
