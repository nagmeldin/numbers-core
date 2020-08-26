package org.zone

import javax.inject.Singleton

@Singleton
class One {
    def type = Parity.EVEN
    def magnitude = 1.0
    def isPrime = false // 2,3,5,7,11, 13, etc

    def add(n){
        return 1 + n
    }
    def subtract(n){
        return 1 - n
    }
    def multiply(n){
        return 1 * n
    }
    def divide(n){
        return 1 / n
    }
    def raise(n){
        return 1
    }
    def inverse(){
        return 1
    }
    def negative(){
        return -1
    }
    def exp() {  // Euler's num
        return Math.exp(1)
    }
    def absolute(){
        return 1
    }
    def sine(){
        return Math.sin(1)
    }
    def cosine(){
        return Math.cosin(1)
    }
    def tan(){
        return Math.tan(1)
    }

}