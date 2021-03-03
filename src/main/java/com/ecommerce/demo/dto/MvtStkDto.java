package com.ecommerce.demo.dto;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.demo.model.Article;
import com.ecommerce.demo.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {

	private Instant dateMvt;
	
	private BigDecimal quantite;
	
	private ArticleDto article;
	
	private TypeMvtStk typeMvt;
}
