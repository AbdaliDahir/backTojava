package com.ecommerce.demo.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "entreprise")
public class Entreprise extends AbstractEntity {
	
	private String nom;
	
	private String description;
	
	@Embedded
	private Adresse adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String steWeb;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> utilisateurs;
}
