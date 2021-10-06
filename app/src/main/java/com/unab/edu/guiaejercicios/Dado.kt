package com.unab.edu.guiaejercicios

class Dado {
    var valor:Int? = null
        get() = field
        set(value) {
            if (value != null) {
                if(value <= 0 || value >= 7){
                    field = 1
                }else{
                    field = value
                }
            }
        }

    fun GirarDado(){
        if(valor == null){
            var opcion = (1..6).random()
            println("Este dado tiene el valor de:  $opcion")
        }else{
            println("Este dado tiene el valor de: $valor")
        }
    }
}