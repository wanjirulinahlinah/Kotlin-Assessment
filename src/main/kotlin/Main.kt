fun main(args: Array<String>) {
    word()
    password("Linahwainaina","Linah203784",1212,5677)
    mutiples()
   val currentaccount =SavingsAccount(20.0,10.0,1.0)
       currentaccount.deposit()
       currentaccount.withdraw()
       currentaccount.details()

   var savingsAccount=SavingsAccount(20.0,10.0,1.0)
    currentaccount.deposit()
       savingsAccount.withdraw()
    savingsAccount.details()



  }
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun word(name1: String){
    var name = ("Wainaina")
  println("name")
 }


//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun password(condition1: String, condition2: String,condition3:Int,condition4:Int): Int {
    var words=(condition1+condition2+condition3+condition4)
    return words
}


//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun mutiples(){
var mutiples = 1
var i = 1000

while (i != 1) {
    mutiples *= i     // sum = sum + i;


}
println("multiple = $mutiples")


//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)


class CurrentAccount(val  number:Double,var  name:Double,var balance:Double){
    fun deposit(){
        println("Account number x with balance y is operated by z")
    }
    fun withdraw(){
        println("Account number x with balance y is operated by z")
    }
    fun details(){
        println("Account number x with balance y is operated by z")
    }
}



}

//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(val  number:Double,var  name:Double,var balance:Double){
    fun deposit(){
        println("Account number x with balance y is operated by z")
    }
    fun withdraw(){
        println("Account number x with balance y is operated by z and will allow the one to withdraw money from the account")

    }

    fun details(){
        println("Account number x with balance y is operated by z")
    }
}







