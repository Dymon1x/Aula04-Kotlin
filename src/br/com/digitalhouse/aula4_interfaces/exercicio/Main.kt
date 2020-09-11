package br.com.digitalhouse.aula4_interfaces.exercicio

fun main(){
    val documento = Documento("Aula Kotlin", ".docx")
    val foto = Foto("Foto de Dog", ".png")
    val contrato = Contrato("Contrato de desenvolvimento", ".pdf")

    val impressora = Impressora()

    impressora.adicionaNaFila(foto, documento, contrato)
    impressora.imprimeFila()
}