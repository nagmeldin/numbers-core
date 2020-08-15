package org.zone

import javax.inject.Singleton

@Singleton
class RandomNumberService {

   def sum(){
       def random = new Random().nextInt(1000)

       println "The random number is: $random"
       def sum = (0..random).sum { int num -> num * 2 }
       def result =  "The sum of numbers between 0 and $random is $sum"
       return result
   }

    def sum(number){
        def sum = 0
        for( int i in 0..number) {
            sum = sum + i
        }
        def total =  "The sum of numbers between 0 and the selected $number is $sum"
        return total
    }

}