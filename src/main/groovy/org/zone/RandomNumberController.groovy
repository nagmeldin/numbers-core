package org.zone

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/randomnumber")
class RandomNumberController {

    private RandomNumberService randomNumberService

    public RandomNumberController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService
    }

    @Get(uri="/")
    def index() {
        "Welcome to random numbers!"
    }
    @Get(uri="/ver")
    def getVersion() {
         return 1.0
    }
    @Get("/sum")
    def getRadomSum() {
        return randomNumberService.sum()
    }
    @Get("/sum/{number}")
    def getCertainSum(number) {
        return randomNumberService.sum(number)
    }
    @Get("/singledigit/{number}")
    def getNumber(number) {
         return randomNumberService.getSingleDigit(number)
    }

}