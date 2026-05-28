class ProductoInventario(
    val codigo: Int,
    val nombre: String,
    var precio: Double,
    var stock: Int
) {
    fun consultar() {
        println("El nombre del producto es: $nombre")
        println("El precio es: $precio")
        println("El stock es: $stock")
    }
    fun aumStock() {
        println("Ingrese el valor que desea agregar al stock:")
        val agregarStock = readLine()?.toIntOrNull() ?: 0
        stock += agregarStock
        println("El nuevo stock es: $stock")
    }
    fun dismStock() {
        println("Ingrese el valor que desea disminuir del stock:")
        val disminuirStock = readLine()?.toIntOrNull() ?: 0
        stock -= disminuirStock
        println("El nuevo stock es: $stock")
    }
    fun validacionPrecio() {
        if (precio < 0) {
            println("¡El precio no puede ser negativo!")
        } else {
            println("Precio correcto")
        }
    }
    fun validacionStock() {
        if (stock < 0) {
            println("¡El stock no puede ser negativo!")
        } else {
            println("Stock correcto")
        }
    }
}
fun main() {
    print("Ingrese el código del producto: ")
    val codigo = readLine()?.toIntOrNull() ?: 0
    print("Ingrese el nombre del producto: ")
    val nombre = readLine() ?: ""
    print("Ingrese el precio del producto: ")
    val precio = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el stock del producto: ")
    val stock = readLine()?.toIntOrNull() ?: 0
    val productoInventario01 = ProductoInventario(codigo,nombre,precio,stock)
    productoInventario01.aumStock()
    productoInventario01.dismStock()
    productoInventario01.validacionPrecio()
    productoInventario01.validacionStock()
    productoInventario01.consultar()
}