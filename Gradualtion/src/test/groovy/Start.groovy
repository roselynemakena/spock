import javafx.application.Application
import spock.lang.Specification
import spock.lang.Unroll

import javax.xml.ws.Service


class PersonSpec extends Specification{
    def "Given two variables"(){
        given: "integers 5 and 10"
            def a = 5
        def b = 10

        when: "The integers are added together"
            def sum = a+b

        then: "The result is 15"
            assert sum == 15

    }
@Unroll
    def "Given a class Teacher() first name should be Match the given name"(){
        given: "Person has a first name"
            Teacher teacherA = new Teacher(firstName: fname, lastName: lname)

        expect: "The first name to be the correct name provided by the user"
            teacherA.firstName == fname

        where: "The follwing results to be true"

        fname | lname
        "Roselyne" | "Makena"
        "Rose" | "Mak"
        "Michael" | "Khameba"

    }

    @Unroll
    def "Obtaining a square of a given number"(){

        expect: "We multiply x and x, the result should be equal to y"
        y == x*x

        where: "The following results to be true"

        x | y
        2 | 4
        5 | 25
        9 | 81
        10| 100
    }
@Unroll
    def "Test the addition of numbers in addNumbers()"(){
        given: "A new Maths Object is created"
            def math = new Maths(num1:num1, num2:num2)

        expect: "The sums to be correct when addNumbers() is called"
            sum == math.addNumbers(num1,num2)

        where:

        num1 | num2 | sum
        2     |10    | 12
        3    | 3     |6
    }


    def "Testing conditions: "(){
        given: "A new stack is initiated"
        def stack = new Stack()
        def map = new HashMap()

        when: "A null value is pushed into the stack"
        stack.push(null)
        map.put("one", null)

        then: "The stack should not be empty, size should be 1"
        !stack.empty()
        stack.size() == 1
        !map.isEmpty()
    }

    def "Mocking"(){
        given: "A subscriber is registered"

        def service = Mock(Service)
        def app = Application(service)


        when: "The app runs"
        app.run()

        then: ""
        with(service){
            1 * start()
            1 * stop()
            1 * doWork()

        }
    }

    def "Using simple methods"() {
        expect: "The maximum no to be returned: "
            res == Math.max(x,y)

        where: "Numbers are provided"

        x | y | res
        3 | 5 | 5
    }
}