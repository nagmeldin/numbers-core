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

    def getCurrentVersion(){
      def version = 1.0
    }

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
               case 'zero':   result = this.zeroInstance?.weight
                            break
               case '0':   result = this.zeroInstance?.weight
                            break
               case 'one':    result = this.oneInstance?.weight
                            break
               case '1':    result = this.oneInstance?.weight
                            break
               case 'two':    result = this.twoInstance?.weight
                            break
               case '2':    result = this.twoInstance?.weight
                            break
               case 'three':  result = this.threeInstance?.weight
                            break
               case '3':  result = this.threeInstance?.weight
                             break
               case 'four':   result = this.fourInstance?.weight
                            break
               case '4':   result = this.fourInstance?.weight
                            break
               case 'five':   result = this.fiveInstance?.weight
                            break
               case '5':   result = this.fiveInstance?.weight
                            break
               case 'six':    result = this.sixInstance?.weight
                            break
               case '6':    result = this.sixInstance?.weight
                            break
               case 'seven':  result = this.sevenInstance?.weight
                            break
               case '7':  result = this.sevenInstance?.weight
                            break
               case 'eight':  result = this.eightInstance?.weight
                            break
               case '8':  result = this.eightInstance?.weight
                            break
               case 'nine':   result = this.nineInstance?.weight
                            break
               case '9':   result = this.nineInstance?.weight
                            break
               default:     result = -999999
          }
          return result
    }


    def operateSingleDigit(number,op){
        def single
        def result
        switch (number){
            case 'zero' :  single = this.zeroInstance
                break
            case '0' :  single = this.zeroInstance
                break
            case 'one' :   single = this.oneInstance
                break
            case '1' :   single = this.oneInstance
                break
            case 'two':   single = this.twoInstance
                break
            case '2':   single = this.twoInstance
                break
            case 'three': single = this.threeInstance
                break
            case '3': single = this.threeInstance
                break
            case 'four':  single = this.fourInstance
                break
            case '4':  single = this.fourInstance
                break
            case 'five':  single = this.fiveInstance
                break
            case '5':  single = this.fiveInstance
                break
            case 'six':   single = this.sixInstance
                break
            case '6':   single = this.sixInstance
                break
            case 'seven': single = this.sevenInstance
                break
            case '7': single = this.sevenInstance
                break
            case 'eight': single = this.eightInstance
                break
            case '8': single = this.eightInstance
                break
            case 'nine':  single = this.nineInstance
                break
            case '9':  single = this.nineInstance
                break
            default:  single = null
        }
        switch (op){
            case 'squareroot': result = single?.squareRoot() //safe operator
                break
            case 'inverse':    result = single?.inverse()
                break
            case 'negative':   result = single?.negative()
                break
            case 'exp':        result = single?.exp()
                break
            case 'absolute':   result = single?.absolute()
                break
            case 'sine':       result = single?.sine()
                break
            case 'cosine':     result = single?.cosine()
                break
            case 'tan':        result = single?.tan()
                break
            default:     result = -999999
        }
        return result
    }

    def operateSingleDigitPlus(number,op,n){
        def nInt = n.toInteger()
        def single
        def result
        switch (number){
            case 'zero':  single = this.zeroInstance
                break
            case 'one':   single = this.oneInstance
                break
            case 'two':   single = this.twoInstance
                break
            case 'three': single = this.threeInstance
                break
            case 'four':  single = this.fourInstance
                break
            case 'five':  single = this.fiveInstance
                break
            case 'six':   single = this.sixInstance
                break
            case 'seven': single = this.sevenInstance
                break
            case 'eight': single = this.eightInstance
                break
            case 'nine':  single = this.nineInstance
                break
            default:  single = null
        }
        switch (op){
            case 'add':      result = single?.add(nInt)
                break
            case 'subtract': result = single?.subtract(nInt)
                break
            case 'multiply': result = single?.multiply(nInt)
                break
            case 'divide':   result = single?.divide(nInt)
                break
            case 'raise':    result = single?.raise(nInt)
                break
            default:     result = -999999
        }
        return result
    }

}