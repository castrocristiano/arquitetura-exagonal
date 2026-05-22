package br.com.castrosoft.exagonal.adapters.out

import br.com.castrosoft.exagonal.adapters.out.client.AddressResponseMapper
import br.com.castrosoft.exagonal.adapters.out.client.FindAddressByZipCodeClient
import br.com.castrosoft.exagonal.application.core.domain.Address
import br.com.castrosoft.exagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    val findAddressByZipCodeClient: FindAddressByZipCodeClient,
    val addressResponseMapper: AddressResponseMapper
): FindAddressByZipCodeOutputPort {
    override fun find(zipcode: String): Address {
        val address = findAddressByZipCodeClient.find(zipcode)
        return addressResponseMapper.toAddress(address)
    }
}