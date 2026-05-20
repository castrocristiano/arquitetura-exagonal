package br.com.castrosoft.exagonal.config

import br.com.castrosoft.exagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomerConfig {

    @Bean
    fun insertCustomerUseCase(): InsertCustomerUseCase {
        // Aqui você injetaria os adaptadores (output ports) futuramente
        return InsertCustomerUseCase()
    }
}