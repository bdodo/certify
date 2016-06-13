package certify

class Trainee extends Person{

    static hasMany = [certificates:Certificate, trainingEvents:TrainingEvent]
    static belongsTo = TrainingEvent
    static constraints = {
    }
}
