package br.com.digitalhouse.aula4_interfaces.exercicio

class Impressora {
    val listaImprimivel: MutableList<Imprimivel> = mutableListOf()

    fun adicionaNaFila(imprimivel: Imprimivel) = listaImprimivel.add(imprimivel)

//    utilizando o var args
    fun adicionaNaFila(vararg imprimiveis: Imprimivel) {
        listaImprimivel.addAll(imprimiveis) // adiciona todas os valores das classes
    }


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
