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

}