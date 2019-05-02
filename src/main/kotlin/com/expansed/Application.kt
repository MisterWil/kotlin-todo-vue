package com.expansed

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
        info = Info(
                title = "Todo",
                version = "1.0",
                description = "My Todo App",
                license = License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        )
)
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.expansed")
                .mainClass(Application.javaClass)
                .start()
    }
}