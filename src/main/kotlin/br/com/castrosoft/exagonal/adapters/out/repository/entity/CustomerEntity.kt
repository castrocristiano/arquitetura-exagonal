package br.com.castrosoft.exagonal.adapters.out.repository.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
class CustomerEntity {
    @Id
    var id: String? = null
    lateinit var name: String
    lateinit var address: AddressEntity
    lateinit var cpf: String
    var isValidCpf: Boolean = false
}

