package com.ecommerce.demo.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "utilisateur")
public class Utilisateur extends AbstractEntity {

	private String nom;
	
	private String prenom;
	
	private String email;
	
	@Column(name = "datedenaissance")
	private Instant dateDeNaissance;
	
	private String moteDePasse;
	
	@Embedded
	private Adresse adresse;
	
	private String photo;
	
	private String numTel;
	
	@ManyToOne
	@JoinColumn(name="identreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> roles;
}
