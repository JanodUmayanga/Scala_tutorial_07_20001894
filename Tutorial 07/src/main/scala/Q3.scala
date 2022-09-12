object Q3 extends App {

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val acnumber: Int = n
    var balance: Double = b

    def transfer(a:Account,b:Double)= {
      this.balance = this.balance - b
      a.balance = a.balance + b
    }

    override def toString = "[ " + nic + " : " + acnumber + " : " + balance + " ]"
  }

  val x = new Account("99123456V",1,15000)
  val y = new Account("99987654V",2,17000)

  x.transfer(y,2000)

  println(x)
  println(y)

}
