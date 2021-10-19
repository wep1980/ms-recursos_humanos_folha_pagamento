package br.com.wepdev.recursoshumanosfolhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // Habilitando o projeto para utilização do Feign
@SpringBootApplication
public class RecursosHumanosFolhaPagamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursosHumanosFolhaPagamentoApplication.class, args);
    }

}
