package br.com.digitalhouse.aula4_interfaces.exercicio

class Impressora {
    val listaImprimivel: MutableList<Imprimivel> = mutableListOf()

    fun adicionaNaFila(imprimivel: Imprimivel) = listaImprimivel.add(imprimivel)

    fun adicionaNaFila(vararg imprimiveis: Imprimivel) {
        listaImprimivel.addAll(imprimiveis) // adiciona todas os valores das classes
    }

//    utilizando o var args
//    fun adicionaNaFila(vararg imprimiveis: Imprimivel) = imprimiveis.forEach { // inline function
//        adicionaNaFila(it)
//    }

    fun imprimeFila() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
        listaImprimivel.clear()
    }
}