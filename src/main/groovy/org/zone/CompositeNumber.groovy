package org.zone

import javax.inject.Singleton

@Singleton
class CompositeNumber {

    def nums =[ new Nine(), new Eight(), new Seven(), new Six(), new Five(), new Four(), new Three(), new Two(), new One(), new Zero() ]
    def weight
    def type
    def isPrime = testPrime(weight)
            // constructor:
    CompositeNumber (def nums) {
         this.nums = nums
         sum = 0
        nums.eachWithIndex { num, index ->
            if ( num instanceof Nine ||num instanceof Eight || num instanceof Seven ||num instanceof Six || num instanceof Five ||num instanceof Four || num instanceof Three ||num instanceof Two || num instanceof One ||num instanceof Zero){
                sum = sum + 10.Math.pow(index) * num.weight
            }
            this.weight = sum
            this.type = Math.mod(sum) == 0 ? Parity.EVEN : Parity.ODD
        }
    } // End constructor
    def add(n){
        return this.weight+n
    }
    def subtract(n){
        return this.weight-n
    }
    def multiply(n){
        return this.weight*n
    }
    def divide(n){
        return this.weight/n
    }
    def squareRoot(){
        return Math.sqrt(this.weight)
    }
    def raise(n){
        return this.weight*Math.pow(n)
    }
    def inverse(){
        return  1/this.weight
    }
    def negative(){
        return -this.weight
    }
    def exp(){  // Euler's num
        return Math.exp(this.weight )
    }
    def absolute(){
        return Math.abs(this.weight)
    }
    def sine(){
        return Math.sin(this.weight)
    }
    def cosine(){
        return Math.cos(this.weight)
    }
    def tan(){
        return Math.tan(this.weight)
    }

    def testType(number){
        def numInt = number.toInteger()
        def isType
            if (numInt % 2 == 0){
                isType = Parity.EVEN
            } else{
                isType = Parity.ODD
            }
        return isType
    }

    def testPrime(number){
        def numInt = number.toInteger()
        def isPrime = true
        for (int i = 2; i < numInt ; i++) {
            if (numInt % i == 0){
                isPrme = false
                break
            }
        }
        return isPrime
    }
}