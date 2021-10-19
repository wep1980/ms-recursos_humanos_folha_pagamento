package br.com.wepdev.recursoshumanosfolhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Esse projeto vai ser um cliente Ribbon, cliente do micro servico de trabalhadores, que tera varias instancias
@RibbonClient(name = "recursos-humanos-trabalhadores")
@EnableFeignClients // Habilitando o projeto para utilização do Feign
@SpringBootApplication
public class RecursosHumanosFolhaPagamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecursosHumanosFolhaPagamentoApplication.class, args);
    }

}
