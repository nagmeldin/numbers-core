package org.zone

import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Shared

import javax.inject.Inject

@MicronautTest
class RandomNumberControllerSpec extends Specification {

    @Shared @Inject
    EmbeddedServer embeddedServer

    @Shared @AutoCleanup @Inject @Client("/")
    RxHttpClient client

//    void "test index"() {
//        given:
//        HttpResponse response = client.toBlocking().exchange("/randomNumber")
//        expect:
//        response.status == HttpStatus.OK
//    }

    void "test version"() {
        def randomNumberService = new RandomNumberService()
        given:
        def versionNumber = randomNumberService.getCurrentVersion()
        expect:
        versionNumber== 1.0
    }

    void "test zero"() {
        given:
        def zeroInstance = new Zero()
        expect:
        zeroInstance.add(5) == 5
        zeroInstance.subtract(0) == 0
        zeroInstance.multiply(9) == 0
        zeroInstance.divide(5) == Double.POSITIVE_INFINITY
        zeroInstance.squareRoot() == 0
        zeroInstance.raise(7) == 0
        zeroInstance.absolute() == 0
        zeroInstance.weight == 0.0
        zeroInstance.inverse() == Double.POSITIVE_INFINITY
        zeroInstance.negative() == 0
        zeroInstance.exp() == 1
        zeroInstance.sine() == 0
        zeroInstance.tan() == 0
       // zeroInstance.cosine() == 0.999851422228908
    }
    void "test one"() {
        given:
        def oneInstance = new One()
        expect:
        oneInstance.add(5) == 6.0
        oneInstance.subtract(3) == -2.0
        oneInstance.multiply(9) == 9.0
        oneInstance.divide(5) == 0.20
        oneInstance.squareRoot() == 1.0
        oneInstance.raise(7) == 1.0
        oneInstance.absolute() == 1.0
        oneInstance.weight == 1.0
        oneInstance.inverse() == 1.0
        oneInstance.negative() == -1
        oneInstance.exp() == 2.718281828459045
        //oneInstance.sine() == 0.017452406437284
        //oneInstance.tan() == 1.557407724654902
       // oneInstance.cosine() == 0.54030230586814
    }
    void "test nine"() {
        given:
        def nineInstance = new Nine()
        expect:
        nineInstance.add(5) == 14.0
        nineInstance.subtract(3) == 6.0
        nineInstance.multiply(3) == 27.0
        nineInstance.divide(9) == 1.0
        nineInstance.squareRoot() == 3.0
        nineInstance.raise(2) == 81.0
        nineInstance.absolute() == 9.0
        nineInstance.weight == 9.0
        nineInstance.inverse() == 1.0/9.0
        nineInstance.negative() == -9.0
        nineInstance.exp() == 8103.083927575384008
        //nineInstance.sine() == 0.412118485241757
       // nineInstance.tan() == -0.45231565944181
       // nineInstance.cosine() == -0.911130261884677
    }

}
