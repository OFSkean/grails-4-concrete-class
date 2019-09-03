import demo.Zebra
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class ZebraIntegrationSpec extends Specification {

    def "test list"() {
        when:
        def list = Zebra.list()

        then:
        list.empty
    }
}
