package org.zone

import javax.inject.Singleton

@Singleton
class Zero {
    def type = Parity.EVEN
    def magnitude = 0.0
    def isPrime = false // 2,3,5,7,11, 13, etc

    def add(n){
        return n
    }
    def subtract(n){
        return n
    }
    def multiply(n){
        return 0 * n
    }
    def divide(n){
        return Double.POSITIVE_INFINITY
    }
    def raise(n){
        return 0
    }
    def inverse(){
        return Double.POSITIVE_INFINITY
    }
    def negative(){
        return 0
    }
    def exp() {  // Euler's num
        return Math.exp(0)
    }
    def absolute(){
        return 0
    }
    def sine(){
        return 0
    }
    def cosine(){
        return Math.PI/2
    }
    def tan(){
        return 0
    }
}