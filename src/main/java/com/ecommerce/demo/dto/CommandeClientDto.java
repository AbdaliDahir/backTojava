package com.ecommerce.demo.dto;

import java.time.Instant;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.ecommerce.demo.model.Client;
import com.ecommerce.demo.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {

	private String code;
	
	private Instant dateCommande;
	
	private ClientDto client;

	private List<LigneCommandeClientDto> ligneCommandeClients;
	
}
