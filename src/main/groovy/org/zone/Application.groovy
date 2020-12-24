package org.zone

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

//Author: Nagm eldin
//Since: July 2002

@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}
// build:
// $ ./gradlew build
// Test:
// $ ./gradlew test
// Run:
// $ ./gradlew run
// Checkout at:
// http://localhost:9191/randomnumber
// http://localhost:9191/randomnumber/ver
// http://localhost:9191/randomnumber/sum
// http://localhost:9191/randomnumber/sum/7
