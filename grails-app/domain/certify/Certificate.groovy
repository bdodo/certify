package certify

class Certificate {

    int CertificateNo
    CertificateType certificateType
    Category category
    Date issueDate
    Date expiryDate
    Boolean printed = false
    Date datePrinted

    static belongsTo = [trainee:Trainee, trainingEvent:TrainingEvent]

    static constraints = {

    }
}
