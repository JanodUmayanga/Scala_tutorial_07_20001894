object Q1 extends App {

  class Rational(x: Int, y: Int) {

    def numer = x

    def denom = y

    def neg = new Rational(-this.numer,this.denom)

    override def toString = numer + "/" + denom

  }

  val x = new Rational(1,2)
  val y = x.neg

  println(y)

}
