package certify

class Category {
    String name
    String description

    static constraints = {
        name()
        description nullable: true
    }
}
