package certify

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class PersonController {
    def scaffold = Person
}
