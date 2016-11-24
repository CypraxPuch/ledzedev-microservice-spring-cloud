package com.ledzedev.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 24/Nov/2016.
 */
@EnableEurekaClient
@SpringBootApplication
public class LedzedevMicroserviceSpringCloudApplication {

	private static final Logger log = LoggerFactory.getLogger(LedzedevMicroserviceSpringCloudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LedzedevMicroserviceSpringCloudApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RepositorioProductosDB db){
		return args -> {
			Arrays.asList(
					new Producto("Queso Oaxaca", 50L),
					new Producto("Queso Cotija", 4L),
					new Producto("Queso Panela", 20L),
					new Producto("Crema entera", 10L),
					new Producto("Crema deslactosada", 18L),
					new Producto("Gelatina", 7L),
					new Producto("Yakult", 80L),
					new Producto("Refresco", 12L)
			)
			.forEach(db::save);
			log.info("Carga inicial terminada.");
		};
	}
}
