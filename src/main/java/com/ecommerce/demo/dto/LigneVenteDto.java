package com.ecommerce.demo.dto;

import java.math.BigDecimal;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.demo.model.Ventes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {

	private VentesDto vente;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
