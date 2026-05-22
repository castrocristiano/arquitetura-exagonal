package br.com.castrosoft.exagonal.adapters.out.client

import br.com.castrosoft.exagonal.adapters.out.client.response.AddressResponse
import br.com.castrosoft.exagonal.application.core.domain.Address
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AddressResponseMapper {
    fun toAddress(addressResponse: AddressResponse): Address
}