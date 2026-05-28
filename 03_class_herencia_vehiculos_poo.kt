// Clase base
open class Vehiculo(
    val marca: String,
    val modelo: String,
    val anio: Int
) {
    open fun mostrarDatos() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
    }
    fun encender() {
        println("$marca $modelo está encendido")
    }
}
class Auto(
    marca: String,
    modelo: String,
    anio: Int,
    val numeroPuertas: Int
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        super.mostrarDatos()
        println("Número de puertas: $numeroPuertas")
    }
}
class Motocicleta(
    marca: String,
    modelo: String,
    anio: Int,
    val cilindrada: Int
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        super.mostrarDatos()
        println("Cilindrada: $cilindrada cc")
    }
}

fun main() {
    val auto = Auto(
        "Toyota",
        "Corolla",
        2022,
        4
    )
    val moto = Motocicleta(
        "Yamaha",
        "MT-07",
        2021,
        689
    )
    println("AUTO")
    auto.mostrarDatos()
    auto.encender()
    println()
    println("MOTOCICLETA")
    moto.mostrarDatos()
    moto.encender()
}