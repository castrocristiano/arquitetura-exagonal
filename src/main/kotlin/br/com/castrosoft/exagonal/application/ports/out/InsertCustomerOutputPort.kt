package br.com.castrosoft.exagonal.application.ports.out

import br.com.castrosoft.exagonal.application.core.domain.Customer

interface InsertCustomerOutputPort {
    fun insert(customer: Customer)
}