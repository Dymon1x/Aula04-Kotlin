package br.com.digitalhouse.aula4_interfaces.exercicio

class Documento(override val nome: String, override val tipoDocumento: String) : Imprimivel {
    override fun imprimir() {
        println("Eu sou um documento word - Nome: $nome, tipo: $tipoDocumento")
    }
}