package br.com.wepdev.recursoshumanosfolhapagamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {


    /**
     * Metodo que registra uma instancia unica, singleton de um objeto RestTemplate, essa instancia vai ficar disponivel, e pode ser utilizada em
     * outros componentes.
     *
     * Padrão de projeto Singleton, instancia única
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
