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
        zeroInstance.cosine() == 1.0
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
        oneInstance.sine() == 0.01745240643728351
        oneInstance.tan() == 0.017455064928217585
        oneInstance.cosine() == 0.9998476951563913
    }

    void "test two"() {
        given:
        def twoInstance = new Two()
        expect:
        twoInstance.add(5) == 7.0
        twoInstance.subtract(3) == -1.0
        twoInstance.multiply(3) == 6.0
        twoInstance.divide(8) == 0.25
        twoInstance.squareRoot() == 1.4142135623730951
        twoInstance.raise(2) == 4.0
        twoInstance.absolute() == 2.0
        twoInstance.weight == 2.0
        twoInstance.inverse() == 0.5
        twoInstance.negative() == -2
        twoInstance.exp() == 7.38905609893065
        twoInstance.sine() == 0.03489949670250097
        twoInstance.tan() == 0.03492076949174773
        twoInstance.cosine() == 0.9993908270190958
    }

    void "test three"() {
        given:
        def threeInstance = new Three()
        expect:
        threeInstance.add(5) == 8.0
        threeInstance.subtract(3) == 0.0
        threeInstance.multiply(3) == 9.0
        threeInstance.divide(3) == 1.00
        threeInstance.squareRoot() == 1.7320508075688772
        threeInstance.raise(2) == 9.0
        threeInstance.absolute() == 3.0
        threeInstance.weight == 3.0
        threeInstance.inverse() == 0.3333333333
        threeInstance.negative() == -3.0
        threeInstance.exp() == 20.085536923187668
        threeInstance.sine() == 0.052335956242943835
        threeInstance.tan() == 0.0524077792830412
        threeInstance.cosine() == 0.9986295347545738
    }
    void "test four"() {
        given:
        def fourInstance = new Four()
        expect:
        fourInstance.add(5) == 9.0
        fourInstance.subtract(3) == 1.0
        fourInstance.multiply(3) == 12.0
        fourInstance.divide(2) == 2.0
        fourInstance.squareRoot() == 2.0
        fourInstance.raise(2) == 16.0
        fourInstance.absolute() == 4.0
        fourInstance.weight == 4.0
        fourInstance.inverse() == 0.25
        fourInstance.negative() == -4.0
        fourInstance.exp() == 54.598150033144236
        fourInstance.sine() == 0.0697564737441253
        fourInstance.tan() == 0.06992681194351041
        fourInstance.cosine() == 0.9975640502598242
    }

    void "test five"() {
        given:
        def fiveInstance = new Five()
        expect:
        fiveInstance.add(5) == 10.0
        fiveInstance.subtract(3) == 2.0
        fiveInstance.multiply(3) == 15.0
        fiveInstance.divide(5) == 1.0
        fiveInstance.squareRoot() == 2.23606797749979
        fiveInstance.raise(3) == 125.0
        fiveInstance.absolute() == 5.0
        fiveInstance.weight == 5.0
        fiveInstance.inverse() == 0.20
        fiveInstance.negative() == -5.0
        fiveInstance.exp() == 148.4131591025766
        fiveInstance.sine() == 0.08715574274765817
        fiveInstance.tan() == 0.087488663525924
        fiveInstance.cosine() == 0.9961946980917455
    }

    void "test six"() {
        given:
        def sixInstance = new Six()
        expect:
        sixInstance.add(4) == 10.0
        sixInstance.subtract(3) == 3.0
        sixInstance.multiply(2) == 12.0
        sixInstance.divide(2) == 3.0
        sixInstance.squareRoot() == 2.449489742783178
        sixInstance.raise(2) == 36.0
        sixInstance.absolute() == 6.0
        sixInstance.weight == 6.0
        sixInstance.inverse() == 0.1666666667
        sixInstance.negative() == -6.0
        sixInstance.exp() == 403.4287934927351
        sixInstance.sine() == 0.10452846326765347
        sixInstance.tan() == 0.10510423526567647
        sixInstance.cosine() == 0.9945218953682733
    }

    void "test seven"() {
        given:
        def sevenInstance = new Seven()
        expect:
        sevenInstance.add(4) == 11.0
        sevenInstance.subtract(3) == 4.0
        sevenInstance.multiply(3) == 21.0
        sevenInstance.divide(2) == 3.5
        sevenInstance.squareRoot() == 2.6457513110645907
        sevenInstance.raise(2) == 49.0
        sevenInstance.absolute() == 7.0
        sevenInstance.weight == 7.0
        sevenInstance.inverse() == 0.1428571429
        sevenInstance.negative() == -7.0
        sevenInstance.exp() == 1096.6331584284585
        sevenInstance.sine() == 0.12186934340514748
        sevenInstance.tan() == 0.1227845609029046
        sevenInstance.cosine() == 0.992546151641322
    }

    void "test eight"() {
        given:
        def eightInstance = new Eight()
        expect:
        eightInstance.add(2) == 10.0
        eightInstance.subtract(3) == 5.0
        eightInstance.multiply(3) == 24.0
        eightInstance.divide(2) == 4.0
        eightInstance.squareRoot() == 2.8284271247461903
        eightInstance.raise(2) == 64.0
        eightInstance.absolute() == 8.0
        eightInstance.weight == 8.0
        eightInstance.inverse() == 0.125
        eightInstance.negative() == -8.0
        eightInstance.exp() == 2980.9579870417283
        eightInstance.sine() == 0.13917310096006544
        eightInstance.tan() == 0.14054083470239145
        eightInstance.cosine() == 0.9902680687415704
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
        nineInstance.sine() == 0.15643446504023087
        nineInstance.tan() == 0.15838444032453627
        nineInstance.cosine() == 0.9876883405951378
    }

}
