package certify

class Person {
    String firstname
    String lastname
    Gender gender
    String email
    String phone
    String idNumber

    static constraints = {
        firstname()
        lastname()
        gender nullable: true
        idNumber nullable: true
        email email: true, nullable: true
        phone nullable: true
    }

    static mapping = {
        tablePerHierachy false
    }
}
