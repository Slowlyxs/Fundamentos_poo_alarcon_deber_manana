class Libro(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val numeroPaginas: Int
) {
    fun mostrarInformacion() {
        println("Titulo: $titulo")
        println("Autor: $autor")
        println("Año de publicacion: $anioPublicacion")
        println("Numero de páginas: $numeroPaginas")
    }
    fun clasificarLibro() {
        if (anioPublicacion < 2000) {
            println("El libro es antiguo.")
        } else {
            println("El libro es reciente.")
        }
    }
}

fun main() {
    print("Ingrese el titulo del libro: ")
    val titulo = readLine() ?: ""
    print("Ingrese el autor del libro: ")
    val autor = readLine() ?: ""
    print("Ingrese el año de publicacion: ")
    val anio = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el numero de paginas: ")
    val paginas = readLine()?.toIntOrNull() ?: 0
    val libro1 = Libro(titulo, autor, anio, paginas)
    libro1.mostrarInformacion()
    libro1.clasificarLibro()
}