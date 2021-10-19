package br.com.wepdev.recursoshumanosfolhapagamento.services;

import br.com.wepdev.recursoshumanosfolhapagamento.entities.Pagamento;
import br.com.wepdev.recursoshumanosfolhapagamento.entities.Trabalhador;
import br.com.wepdev.recursoshumanosfolhapagamento.feignclients.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service // Registra a classe como componente do Spring
public class PagamentoService {


//    @Autowired
//    private RestTemplate restTemplate;
//
//
//    /*
//    Pegando o valor criado no application.properties, propriedade criada para comunicação com projeto de Trabalhador
//     */
//    @Value("${recursos-humanos-trabalhadores}")
//    private String trabalhadoresHost;


    @Autowired
    private TrabalhadorFeignClient trabalhadorFeignClient;



    /**
     * O id do trabalhador é chamado no micro serviço de Trabalhador.
     * String.valueOf(trabalhadorId) --> Convertendo o valor do Id(Long) para String. Poderia tambem ser feito assim --> ("id", ""+trabalhadorId)
     */
    public Pagamento getPagamento(Long trabalhadorId, int dias){

        // Variavel criada para mapear o id do trabalhador passado na requisição e o trabalhadorId passado no método. utilizado com RestTemplate
//        Map<String, String> uriVariaveis = new HashMap<>();
//        uriVariaveis.put("id", String.valueOf(trabalhadorId));

//        Trabalhador trabalhador = restTemplate.getForObject(
//                trabalhadoresHost + "/trabalhadores/{id}",
//                Trabalhador.class,
//                uriVariaveis); // Utilizado para o RestTemplate

        Trabalhador trabalhador = trabalhadorFeignClient.findById(trabalhadorId).getBody();

        return new Pagamento(trabalhador.getNome(), trabalhador.getGanhoPorDia(), dias);
    }
}
