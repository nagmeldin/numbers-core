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
