package org.zone

import javax.inject.Singleton

@Singleton
class RandomNumberService {

    def zeroInstance = new Zero()
    def oneInstance = new One()
    def twoInstance = new Two()
    def threeInstance = new Three()
    def fourInstance = new Four()
    def fiveInstance = new Five()
    def sixInstance = new Six()
    def sevenInstance = new Seven()
    def eightInstance = new Eight()
    def nineInstance = new Nine()

   def sum(){
       def random = new Random().nextInt(1000)

       println "The random number is: $random"
       def sum = 0
       0.upto(random){ it ->
           sum = sum + it
       }
       def result =  "The sum of numbers between 0 and $random is $sum"
   }

    def sum(number){
        def numInt = number.toInteger()
        def sum = 0
        0.upto(numInt){ it ->
            sum = sum + it
        }
        def total =  "The sum of numbers between 0 and the selected $number is $sum"
    }

    def getSingleDigit(number){
        def result
        switch (number){
               case 'zero':   result = this.zeroInstance.weight
                            break
               case 'one':    result = this.oneInstance.weight
                            break
               case 'two':    result = this.twoInstance.weight
                            break
               case 'three':  result = this.threeInstance.weight
                            break
               case 'four':   result = this.fourInstance.weight
                            break
               case 'five':   result = this.fiveInstance.weight
                            break
               case 'six':    result = this.sixInstance.weight
                            break
               case 'seven':  result = this.sevenInstance.weight
                            break
               case 'eight':  result = this.eightInstance.weight
                            break
               case 'nine':   result = this.nineInstance.weight
                            break
               default:     result = -1
          }
          return result
    }
}