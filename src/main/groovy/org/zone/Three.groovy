package org.zone

import javax.inject.Singleton

@Singleton
class Three {
    def type = Parity.EVEN
    def weight = 3.0
    def isPrime = true // 2,3,5,7,11, 13, etc

    def add(n){
        return this.weight + n
    }
    def subtract(n){
        return this.weight-n
    }
    def multiply(n){
        return this.weight * n
    }
    def divide(n){
        return this.weight/n
    }
    def squareRoot(){
        return Math.sqrt(this.weight)
    }
    def raise(n){
        return Math.pow(this.weight,n)
    }
    def inverse(){
        return 1/this.weight
    }
    def negative(){
        return -this.weight
    }
    def exp() {  // Euler's num
        return Math.exp(this.weight )
    }
    def absolute(){
        return Math.abs(this.weight)
    }
    def sine(){
        return Math.sin(this.weight )
    }
    def cosine(){
        return Math.cosin(this.weight )
    }
    def tan(){
        return Math.tan(this.weight )
    }

}