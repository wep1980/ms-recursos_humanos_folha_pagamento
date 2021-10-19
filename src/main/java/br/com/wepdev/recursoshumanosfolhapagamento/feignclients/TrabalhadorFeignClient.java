package br.com.wepdev.recursoshumanosfolhapagamento.feignclients;

import br.com.wepdev.recursoshumanosfolhapagamento.entities.Trabalhador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component // Componente gerenciado pelo Spring
@FeignClient(name = "recursos-humanos-trabalhadores", url = "localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeignClient {


    @GetMapping(value = "/{id}")
    ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}
