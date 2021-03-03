package com.ecommerce.demo.model;

import java.math.BigDecimal;
import java.time.Instant;

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
@Table(name= "mvtstk")
public class MvtStk extends AbstractEntity {
	
	private Instant dateMvt;
	
	private BigDecimal quantite;
	
	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
	
	private TypeMvtStk typeMvt;
}