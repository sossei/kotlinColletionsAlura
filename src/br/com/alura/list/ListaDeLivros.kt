package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Livro1",
        autor = "Autor1",
        anoPublicacao = 2001,
        editora = "Editora1"
    )
    val livro2 = Livro(
        titulo = "Livro2",
        autor = "Autor2",
        anoPublicacao = 2002,
        editora = "Editora2"
    )
    val livro3 = Livro(
        titulo = "Livro3",
        autor = "Autor3",
        anoPublicacao = 2003,
        editora = "Editora3"
    )
    val livro4 = Livro(
        titulo = "Livro4",
        autor = "Autor4",
        anoPublicacao = 2004,
        editora = "Editora4"
    )
    val livro5 = Livro(
        titulo = "Livro5",
        autor = "Autor5",
        anoPublicacao = 2005,
        editora = "Editora5"
    )
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    livros.imprimeComMarcadores()
    livros.add(livro5)
    livros.imprimeComMarcadores()
    livros.remove(livro1)
    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val ordenadoAutor = livros.sortedBy { it.autor }
    ordenadoAutor.imprimeComMarcadores()
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - (${it.anoPublicacao}) ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de livros #### \n$textoFormatado")
}