package org.zone

import javax.inject.Singleton

//Author: Nagm eldin
//Since: July 2020

@Singleton
class Zero {
    def type = Parity.EVEN
    def weight = 0.0
    def isPrime = false // 2,3,5,7,11, 13, etc

    def add(n){
        return n
    }
    def subtract(n){
        return n
    }
    def multiply(n){
        return this.weight * n
    }
    def divide(n){
        return Double.POSITIVE_INFINITY
    }
    def squareRoot(){
        return this.weight
    }
    def raise(n){
        return 0
    }
    def inverse(){
        return Double.POSITIVE_INFINITY
    }
    def negative(){
        return this.weight
    }
    def exp() {  // Euler's num
        return Math.exp(this.weight )
    }
    def absolute(){
        return Math.abs(this.weight)
    }
    def sine(){
        def zeroRad = Math.toRadians(this.weight)
        return Math.sin(zeroRad)
    }
    def cosine(){
        def zeroRad = Math.toRadians(this.weight)
        return Math.cos(zeroRad)
    }
    def tan(){
        def zeroRad = Math.toRadians(this.weight)
        return Math.tan(zeroRad)
    }
}