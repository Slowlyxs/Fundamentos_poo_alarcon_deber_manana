package sistema

import modelo.Libro

class Biblioteca {

    private val libros = mutableListOf<Libro>()

    fun registrarLibro(libro: Libro) {
        libros.add(libro)
        println("Libro registrado: ${libro.getTitulo()}")
    }

    fun listarDisponibles() {
        println("\n--- Libros disponibles ---")
        libros.filter { it.estaDisponible() }
            .forEach { it.mostrar() }
    }

    fun buscarPorTitulo(titulo: String) {
        val libro = libros.find { it.getTitulo().equals(titulo, true) }

        if (libro != null) {
            libro.mostrar()
        } else {
            println("Libro no encontrado")
        }
    }

    fun prestarLibro(titulo: String) {
        val libro = libros.find { it.getTitulo().equals(titulo, true) }

        when {
            libro == null -> println("Libro no existe")
            libro.prestar() -> println("Libro prestado correctamente")
            else -> println("El libro ya está prestado")
        }
    }

    fun devolverLibro(titulo: String) {
        val libro = libros.find { it.getTitulo().equals(titulo, true) }

        when {
            libro == null -> println("Libro no existe")
            libro.devolver() -> println("Libro devuelto correctamente")
            else -> println("El libro no estaba prestado")
        }
    }
}