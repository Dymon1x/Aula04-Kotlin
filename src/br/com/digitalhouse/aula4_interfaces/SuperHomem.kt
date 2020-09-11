package br.com.digitalhouse.aula4_interfaces

open class SuperHomem: Voador {
    override fun voar() {
        println("Estou voando como um SuperHomem")
        voarRapido()
    }
}