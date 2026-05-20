package br.com.castrosoft.exagonal.application.core.domain

data class Customer(
    val id: String? = null,
    val name: String,
    val address: Address? = null,
    val cpf: String,
    val isValidCpf: Boolean = false
) {
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
        require(cpf.isNotBlank()) { "CPF cannot be blank" }
    }

    /**
     * Exemplo de lógica de domínio dentro da data class.
     * Retorna uma nova instância com o status de CPF atualizado.
     */
    fun validateCpf(): Customer {
        // Aqui viria a lógica real de validação ou apenas a marcação
        // vinda de um serviço externo via Use Case.
        return this.copy(isValidCpf = true)
    }
}