package br.com.castrosoft.exagonal.adapters.out.repository

import br.com.castrosoft.exagonal.adapters.out.repository.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: MongoRepository<CustomerEntity, String> {
}