package org.zone

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/compositeNumber")
class CompositeNumberController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}