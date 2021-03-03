package com.ecommerce.demo.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.demo.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

	private String roleName;
	
	private UtilisateurDto utilisateur;
}
