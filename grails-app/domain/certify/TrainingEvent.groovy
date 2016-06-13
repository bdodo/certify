package certify

class TrainingEvent {
    Date startDate
    Date endDate
    String venue
    Facilitator facilitator
    static hasMany = [trainees:Trainee, certificates:Certificate]
    static belongsTo = [course:Course]

    static constraints = {
        startDate()
        endDate()
        venue()
        facilitator()
    }
}
