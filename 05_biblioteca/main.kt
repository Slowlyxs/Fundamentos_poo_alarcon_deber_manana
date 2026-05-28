package main

import modelo.Libro
import sistema.Biblioteca

fun main() {
    val biblioteca = Biblioteca()

    biblioteca.registrarLibro(Libro(1, "1984", "George Orwell"))
    biblioteca.registrarLibro(Libro(2, "Cien años de soledad", "Gabriel García Márquez"))
    biblioteca.registrarLibro(Libro(3, "El Principito", "Antoine de Saint-Exupéry"))

    biblioteca.listarDisponibles()


    biblioteca.prestarLibro("1984")
    biblioteca.prestarLibro("1984") // validación


    println("\n--- Búsqueda ---")
    biblioteca.buscarPorTitulo("1984")

    biblioteca.devolverLibro("1984")
    biblioteca.devolverLibro("1984") // validación


    biblioteca.listarDisponibles()
}