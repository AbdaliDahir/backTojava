package com.ecommerce.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "lign_vente")
public class LigneVente extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes vente;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
