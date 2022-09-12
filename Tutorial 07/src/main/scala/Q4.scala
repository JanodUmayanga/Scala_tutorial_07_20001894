object Q4 extends App {

  var bank: List[Account] = List()

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val acnumber: Int = n
    var balance: Double = b

    def deposit(a: Double) = this.balance = this.balance + a

    override def toString = "[" + nic + ":" + acnumber + ":" + balance + "]"
  }

  val x = new Account("99123456V", 1, 15000)
  val y = new Account("99987654V", 2, -2000)
  val z = new Account("20007890V", 3, 13000)
  val m = new Account("20014567V", 4, -1000)

  bank = bank :+ x
  bank = bank :+ y
  bank = bank :+ z
  bank = bank :+ m

  println(bank)

  //4.1
  val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)
  println(overdraft(bank))

  //4.2
  val balance = (b:List[Account]) => {
    var balances: List[Double] = List()
    b.map(x => balances = balances :+ x.balance)
    balances.reduce((x,y) => x+y)
  }
  val sum = balance(bank)
  println(sum)

  //4.3
  val interest= (b:List[Account]) => b.map(x => if(x.balance>=0){x.deposit(x.balance*0.05)} else {x.deposit(x.balance*0.1)})
  interest(bank)
  println(bank)

}
