package certify

class Course {
    String name
    String description

    static hasMany = [trainingEvents: TrainingEvent, facilitators:Facilitator]
    static belongsTo = Facilitator

    static constraints = {
        name nullable: false
        description nullable: true
    }
}
