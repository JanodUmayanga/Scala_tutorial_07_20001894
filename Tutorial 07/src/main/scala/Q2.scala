object Q2 extends App {

  class Rational(x: Int, y: Int) {

    def numer = x

    def denom = y

    def -(r: Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, denom * r.denom)

    override def toString = numer + "/" + denom

  }

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val result = x-y-z

  println(result)

}
