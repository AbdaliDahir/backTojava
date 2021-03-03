package com.ecommerce.demo.model;

import java.time.Instant;

import javax.persistence.Entity;
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
@Table(name= "ventes")
public class Ventes extends AbstractEntity {
	
	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
}
