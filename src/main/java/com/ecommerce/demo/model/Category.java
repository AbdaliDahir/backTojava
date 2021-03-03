package com.ecommerce.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "category")
public class Category extends AbstractEntity {
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
}
