package br.com.digitalhouse.aula4_interfaces.exercicio

class Contrato(override val nome: String, override val tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Eu sou um contrato muito legal - Nome: $nome, tipo: $tipoDocumento")
    }
}