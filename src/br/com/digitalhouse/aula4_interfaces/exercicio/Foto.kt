package br.com.digitalhouse.aula4_interfaces.exercicio

class Foto(override val nome: String, override val tipoDocumento: String): Imprimivel {
    override fun imprimir(){
        println("Eu sou uma selfie - Nome: $nome, tipo: $tipoDocumento")
    }
}