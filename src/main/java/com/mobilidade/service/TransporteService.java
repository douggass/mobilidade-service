package com.mobilidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilidade.client.PoatransporteClient;
import com.mobilidade.dto.TrasporteFiltro;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransporteService {

	@Autowired
	private PoatransporteClient poatransporteClient;

	public String listarLinhasOnibus() {
		
		TrasporteFiltro filtro = TrasporteFiltro.builder()
				.a("nc")
				.p("%")
				.t("o")
				.build();
		
		log.info("lista onibus: {}", poatransporteClient.listar(filtro).getBody());
		return "";

	}

}
