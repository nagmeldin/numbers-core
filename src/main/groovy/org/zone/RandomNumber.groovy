package org.zone

import javax.inject.Singleton

@Singleton
class RandomNumber {

    def number
    public RandomNumber( def number){
        number = this.number
    }

    def getNumber() {
        return number
    }

    void setNumber(number) {
        this.number = number
    }

}