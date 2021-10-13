fun main() {
    // Declaración de variables
    // Aqui tienes que definir las variables que se utilizan

    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    println("dime tu nombre")
    val miNombre= readLine().toString()
    println("Dime tu edad")
    val edad= readLine()!!.toInt()
    println("A que mes estamos?")
    val mes= readLine()!!.toInt()

    // Linea Inicial de programa
    if ((edad <= 5) || (mes <= 0 )|| (edad>12) || (mes>12)) // Si alguno es incorrecto finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        }
    else //Sino, continuo
        {
            //Edad: 8. El alumno está dentro del rango [6-8]
            //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
            println("La edad es $edad y el mes es $mes")

            // Linea final cabecera
            println("_".repeat(80))

            //Da el valor asignado a cada alumno
            var n1=0
            var n2=0
            var n3=0
            if (edad in 6..8){
                if(mes%2==0){
                    n1=2
                    n2=4
                }
                else{
                    n1=1
                    n2=3
                    n3=5
                }
            }else if (edad in 9..10){
                if (mes%2==0){
                    n1=6
                    n2=8
                    n3=10
                }else{
                    n1=7
                    n2=9
                }
            }else {
                n1 = 11
                n2 = 12
                n3 = 13
            }
            //Realiza las tablas
            var x=1
            for (i in 1..10){
                x=n1
                x*=i
                println(x)
            }
            for (i in 1..10){
                x=n2
                x*=i
                println(x)
            }
            if(n3!=0){
                for (i in 1..10){
                    x=n3
                    x*=i
                    println(x)
                }
            }
        }

    // Linea final de programa
    println("*".repeat(80))

}