package br.com.castrosoft.exagonal.application.core.usecase

import br.com.castrosoft.exagonal.application.core.domain.Customer
import br.com.castrosoft.exagonal.application.ports.out.FindAddressByZipCodeOutputPort
import br.com.castrosoft.exagonal.application.ports.out.InsertCustomerOutputPort

class InsertCustomerUseCase (
    var findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    var insertCustomerOutputPort: InsertCustomerOutputPort
){

    fun insert(customer: Customer, zipCode: String) {
        val address = findAddressByZipCodeOutputPort.find(zipCode)
        customer.address = address
        insertCustomerOutputPort.insert(customer)
    }

}
