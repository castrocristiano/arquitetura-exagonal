package br.com.castrosoft.exagonal.application.ports.out

import br.com.castrosoft.exagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {
    fun find(zipcode: String): Address
}