package br.com.castrosoft.exagonal.application.core.domain

data class Address (
    val street: String,
    val city: String,
    val state: String
) {
    init {
        require(street.isNotBlank()) { "Street cannot be blank" }
        require(city.isNotBlank()) { "City cannot be blank" }
        require(state.isNotBlank()) { "State cannot be blank" }
    }
}
