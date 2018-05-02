import groovy.transform.ToString

@ToString
class Teacher{

    String firstName, lastName

    def getNames(){
        "$firstName $lastName"
    }
}
@ToString
class Maths{
    def  num1,num2

    def addNumbers(num1, num2){
        num1 + num2
    }

    def subtractNumbers(num1, num2){
        num1 - num2
    }
}