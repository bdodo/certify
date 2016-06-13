package certify

class Facilitator extends Person{

    static hasMany = [courses:Course, trainingEvents:TrainingEvent]
    static constraints = {
    }
}
