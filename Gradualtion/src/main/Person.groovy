import groovy.transform.ToString

@ToString
class Teacher{

    String firstName, lastName

    def getNames(){
        "$firstName $lastName"
    }
}

Teacher a = new Teacher(firstName: "Roselyne", lastName: "Makena")
println a.lastName