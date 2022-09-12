object Q4 extends App {

  var bank: List[Account] = List()

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val acnumber: Int = n
    var balance: Double = b

    override def toString = "[" + nic + ":" + acnumber + ":" + balance + "]"
  }

  val x = new Account("99123456V", 1, 15000)
  val y = new Account("99987654V", 2, -2000)

  bank = bank :+ x
  bank = bank :+ y

  println(bank)

  //4.1
  val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)
  println(overdraft(bank))

  //4.2
//  val balance = (b:List[Account]) => b.reduce((x.balance,y.balance) => x.balance + y.balance)
//  println(balance(bank))

  //4.3
  val interest= (b:List[Account]) => b.map(x.balance => x.balance + x.balance * 0.05)

}
