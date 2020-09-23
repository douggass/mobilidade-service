package com.mobilidade.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.mobilidade.TmpConfig;
import com.mobilidade.dto.TrasporteFiltro;

@FeignClient(url = "${client.poatransporte.url}", name = "poatrasporte", configuration = TmpConfig.class)
public interface PoatransporteClient {

	@GetMapping
	public ResponseEntity<Map<String, String>> listar(@SpringQueryMap TrasporteFiltro filtro);

}
