package org.zone

import javax.inject.Singleton

@Singleton
class RandomNumberService {

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

        switch (number){
               case zero:   def result = new Zero().weight
                            break
               case one:    def result = new One().weight
                            break
               case two:    def result = new Two().weight
                            break
               case three:  def result = new Three().weight
                            break
               case four:   def result = new Four().weight
                            break
               case five:   def result = new Five().weight
                            break
               case six:    def result = new Six().weight
                            break
               case seven:  def result = new Seven().weight
                            break
               case eight:  def result = new Eight().weight
                            break
               case nine:   def result = new Nine().weight
                            break
               default:     def result = 'unknow'
         }
          return result
    }
}