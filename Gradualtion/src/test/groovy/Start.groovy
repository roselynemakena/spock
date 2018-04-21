import spock.lang.Specification
import spock.lang.Unroll


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
            teacherA.firstName != fname

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


}