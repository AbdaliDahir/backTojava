package com.ecommerce.demo.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	
	private String code;
	
	private String designation;
	 
	private List<Article> articles;
}
