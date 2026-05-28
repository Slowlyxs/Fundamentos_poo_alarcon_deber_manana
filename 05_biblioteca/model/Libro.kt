package modelo

class Libro(
    val id: Int,
    val titulo: String,
    val autor: String
) {
    private var prestado: Boolean = false

    fun estaDisponible(): Boolean = !prestado

    fun prestar(): Boolean {
        return if (!prestado) {
            prestado = true
            true
        } else {
            false
        }
    }

    fun devolver(): Boolean {
        return if (prestado) {
            prestado = false
            true
        } else {
            false
        }
    }

    fun mostrar() {
        val estado = if (prestado) "Prestado" else "Disponible"
        println("[$id] $titulo - $autor | $estado")
    }

    fun getTitulo(): String = titulo
}