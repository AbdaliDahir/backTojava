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
@Table(name= "client")
public class Client extends AbstractEntity {
	
	private String nom;
	
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
}
