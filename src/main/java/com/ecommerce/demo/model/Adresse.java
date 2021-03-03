package com.ecommerce.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class Adresse {
	
	private String adresse1;
	
	private String adresse2;
	
	private String ville;
	
	private String codePostale;
	
	private String pays;
}
