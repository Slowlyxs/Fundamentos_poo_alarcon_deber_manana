abstract class MetodoPago {
    abstract fun procesarPago(monto: Double)
}
class PagoEfectivo : MetodoPago() {
    override fun procesarPago(monto: Double) {
        println("Pago en efectivo realizado por $$monto")
    }
}
class PagoTarjeta : MetodoPago() {
    override fun procesarPago(monto: Double) {
        println("Pago con tarjeta procesado por $$monto")
    }
}
class PagoTransferencia : MetodoPago() {
    override fun procesarPago(monto: Double) {
        println("Transferencia bancaria realizada por $$monto")
    }
}

fun main() {
    val pagos = listOf(
        PagoEfectivo(),
        PagoTarjeta(),
        PagoTransferencia()
    )
    val monto = 100.0
    for (pago in pagos) {
        pago.procesarPago(monto)
    }
}
