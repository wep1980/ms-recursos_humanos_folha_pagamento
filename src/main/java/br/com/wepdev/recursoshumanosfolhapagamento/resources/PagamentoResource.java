package br.com.wepdev.recursoshumanosfolhapagamento.resources;

import br.com.wepdev.recursoshumanosfolhapagamento.entities.Pagamento;
import br.com.wepdev.recursoshumanosfolhapagamento.services.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResource {


    @Autowired
    private PagamentoService pagamentoService;


    /**
     * Esse endpoint chama o endpoint do micro serviço de trabalhador
     */
    @HystrixCommand(fallbackMethod = "getPagamentoAlternativo") // configura o nome do metodo alternativo caso ocorra alguma falha na chamada desse end point
    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias){
        Pagamento pagamento = pagamentoService.getPagamento(trabalhadorId, dias);

        return ResponseEntity.ok(pagamento);
    }


    /**
     * Endpoint alternativo caso falhe o endpoint principal -> getPagamento()
     * @param trabalhadorId
     * @param dias
     * @return
     */
    public ResponseEntity<Pagamento> getPagamentoAlternativo(Long trabalhadorId, Integer dias){
        Pagamento pagamento = new Pagamento("Nome criado pelo metodo alternativo do micro serviço folha de pagamento", 400.0, dias);
        return ResponseEntity.ok(pagamento);
    }
























}
