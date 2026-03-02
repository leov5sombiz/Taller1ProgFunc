import scala.annotation.tailrec

package object Recursion {

  /**
   * Ejercicio # 1: Función potencia
   * @param m : Int
   * @param n : Int
   * @return 'm' multiplicado por si mismo 'n' veces
   */

  def potencia(m: Int, n: Int): Int = {
    if (n == 0) 1
    else m * potencia(m, n - 1)
  }

  /**
   * Ejercicio # 2: Función Pascal
   * @param c int
   * @param r int
   * @return Elemento del triángulo de pascal ubicado en 'c','r'
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Ejercicio # 3: Función Balanceo
   * @param chars list[char]
   * @return Booleano que determina si la cadena de paréntesis está equilibrada o no
   */
  def balanceado(chars: List[Char]): Boolean = {

    @tailrec
    def aux(lista: List[Char], contador: Int): Boolean = {
      if (contador < 0) false
      else if (lista.isEmpty) contador == 0
      else if (lista.head == '(')
        aux(lista.tail, contador + 1)
      else if (lista.head == ')')
        aux(lista.tail, contador - 1)
      else
        aux(lista.tail, contador)
    }

    aux(chars, 0)
  }

  /**
   * Ejercicio # 4: Función Cambio monedas
   * @param total int
   * @param denomination list[int]
   * @return cantidad de combinaciones posibles de efectivo
   */
  def cambioMonedas(total: Int, denomination: List[Int]): Int = {
    if (total == 0) 1
    else if (total < 0) 0
    else if (denomination.isEmpty) 0
    else
      cambioMonedas(total - denomination.head, denomination) +
        cambioMonedas(total, denomination.tail)
  }

}