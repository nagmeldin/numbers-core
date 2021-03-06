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
         return randomNumberService?.getCurrentVersion()
    }
    @Get("/sum")
    def getRadomSum() {
        return randomNumberService?.sum()
    }
    @Get("/sum/{number}")
    def getCertainSum(number) {
        return randomNumberService?.sum(number)
    }

    @Get("/singledigit/{number}")
    def getNumber(number) {
          return randomNumberService?.getSingleDigit(number)
    }

    @Get("/singledigit/{number}/{op}")
    def doSingleDigitNumber(number,op) {
        return randomNumberService.operateSingleDigit(number,op)
    }
    @Get("/singledigit/{number}/{op}/{n}")
    def doSingleDigitNumberPlus(number,op,n) {
        return randomNumberService?.operateSingleDigitPlus(number,op,n)
    }
}