package com.unab.edu.guiaejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //resolucion del ejercicio numero 1
        PagoEmpleados("Edgar", 15, 200, 10 )

        //ejercicio 2
        funcionTabla(4, 10)

        //impresion de resultado de ejercicio 3
        var empleado = Empleado()
        empleado.sueldo = 850
        empleado.nombre = "Edgar Calderón"
        empleado.tiempo = 15
        empleado.cargo = "Gerente General"
        empleado.area = "Informatica "
        empleado.impresionResultados()

        //ejercicio numero 4
        println("El valor del dado es:")
        var dado = Dado()
        dado.valor = 5
        dado.GirarDado()

        println("Dado aleatorio:")
        var dadoPosicion = Dado()
        dadoPosicion.GirarDado()
    }

     fun funcionTabla(Parametro:Int, Termino:Int? = null){
        var Final = 10
        if (Termino != null) {
            Final = Termino
        }
        for (num in 1..Final) {
            var resultado = num*Parametro
            println("$Parametro X $num = $resultado")
        }
    }

     fun PagoEmpleados(Nombre:String, pagoHora:Int, cantidadHoras:Int, horasExtras:Int) {
        var nombre=Nombre
        var tiempoTrabajado = (pagoHora * cantidadHoras)
        var horasAdicionales = (pagoHora * horasExtras * 0.25)
        var sumaTotal = tiempoTrabajado + horasAdicionales
        println("El empleado " + nombre + " gana en total " + sumaTotal )

    }
}