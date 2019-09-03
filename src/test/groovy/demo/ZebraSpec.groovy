package demo

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ZebraSpec extends Specification implements DomainUnitTest<Zebra> {

    def "test list"() {
        when:
        def list = Zebra.list()

        then:
        list.empty
    }
}
