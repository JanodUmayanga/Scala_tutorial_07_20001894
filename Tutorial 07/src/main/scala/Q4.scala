object Q4 extends App {

  var bank: List[Account] = List()

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val acnumber: Int = n
    var balance: Double = b

    override def toString =
      "[" + nic + ":" + acnumber + ":" + balance + "]"
  }

}
