

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   try {

       var acumulador: Int? = null
       acumulador = 0

       for(i in 1 .. 5)
       {
           acumulador++
           println(acumulador + i)
       }
   }
   catch (e: Exception)
   {
      var mensaje = "Ocurrio un error"
      println("Ocurrio un error en: ${e.message}" + mensaje)
   }
}