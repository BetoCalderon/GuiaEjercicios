package com.unab.edu.guiaejercicios

class Empleado() {
    var sueldo = 0
        get() = field
        set(value) {
            if(value<0){
                println("El sueldo no puede ser negativo")
            }else {
                field = value
            }
        }

    var nombre:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Ingrese un nombre")
            }
            else if(value!!.isEmpty()) {
                println("Ingrese un nombre")
            }else{
                field = value
            }
        }

    var area:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Ingrese un área")
            }
            else if(value!!.isEmpty()) {
                println("Ingrese un área")
            }else{
                field = value
            }
        }

    var cargo:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("Ingrese un cargo")
            }
            else if(value!!.isEmpty()) {
                println("Ingrese un cargo")
            }else{
                field = value
            }
        }

    var tiempo:Int = 0
        get() = field
        set(value) {

            field = value
        }

    public fun verificacar(): Int {
        return (tiempo.div(5))
    }

    public fun impresionResultados(){
        if( nombre == null ||  cargo == null ||  area == null){
            println("Faltan campos por completar")
        }else{
            var sueldoextra = 25 * verificacar()
            var sueldototal = sueldo + sueldoextra
            println("El Empleado: $nombre , esta en: $area, con el cargo : $cargo, y el sueldo base es: $sueldo, " +
                    "y tiene un tiempo trabajadode: $tiempo, su remuneracion por tiempo es: $sueldoextra, " +
                    "con sueldo final de: $sueldototal")
        }
    }
}