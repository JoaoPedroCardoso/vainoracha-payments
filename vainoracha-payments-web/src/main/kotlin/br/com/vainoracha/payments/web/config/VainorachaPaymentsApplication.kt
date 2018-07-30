package br.com.vainoracha.payments.web.config

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = ["br.com.vainoracha.payments", "br.com.vainoracha.payments.service"])
@EntityScan(basePackages = ["br.com.vainoracha.payments.model"])
@EnableAutoConfiguration
open class VainorachaCoreApplication

fun main(args: Array<String>) {
    runApplication<VainorachaCoreApplication>(*args)
}
