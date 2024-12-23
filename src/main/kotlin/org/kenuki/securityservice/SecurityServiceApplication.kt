package org.kenuki.securityservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class SecurityServiceApplication

fun main(args: Array<String>) {
	runApplication<SecurityServiceApplication>(*args)
}
