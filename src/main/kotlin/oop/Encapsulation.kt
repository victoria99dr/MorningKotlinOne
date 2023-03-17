package oop

fun main(args: Array<String>) {
    var p1 = Person("King", "100")
    p1.setResidence("Nairobi")
    println(p1.getResidence())

    p1.setSalary(3000000.00)
    println(p1.getSalary())
    println(p1.name)
}
// making a class makes one not to be able to make objects out of it
class Person(var name:String, var age:String){
    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
        this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }

    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("Yeah, I can walk")
    }
    fun run(){
        println("Yeah, I can run")
    }
}