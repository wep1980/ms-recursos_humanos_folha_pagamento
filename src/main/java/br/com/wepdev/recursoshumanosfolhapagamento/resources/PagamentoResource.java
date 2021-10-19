package br.com.wepdev.recursoshumanosfolhapagamento.resources;

import br.com.wepdev.recursoshumanosfolhapagamento.entities.Pagamento;
import br.com.wepdev.recursoshumanosfolhapagamento.services.PagamentoService;
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



    @GetMapping(value = "/{trabalhadorId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorId, @PathVariable Integer dias){
        Pagamento pagamento = pagamentoService.getPagamento(trabalhadorId, dias);

        return ResponseEntity.ok(pagamento);

    }
}
