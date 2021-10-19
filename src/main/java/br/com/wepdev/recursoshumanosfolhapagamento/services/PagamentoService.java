package br.com.wepdev.recursoshumanosfolhapagamento.services;

import br.com.wepdev.recursoshumanosfolhapagamento.entities.Pagamento;
import org.springframework.stereotype.Service;


@Service // Registra a classe como componente do Spring
public class PagamentoService {


    /**
     * O id do trabalhador sera chamado no micro serviço de Trabalhador
     */
    public Pagamento getPagamento(Long trabalhadorId, int dias){

        return new Pagamento("Bob", 200.0, dias); // Dados mocado
    }
}
