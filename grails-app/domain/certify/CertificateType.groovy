package certify

class CertificateType {
    String name
    String description

    static constraints = {
        name()
        description nullable: true
    }
}
