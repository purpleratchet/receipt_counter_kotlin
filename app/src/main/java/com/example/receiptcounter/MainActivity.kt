package com.example.receiptcounter

import java.util.*
import kotlin.collections.ArrayList

class MainActivity {
    companion object {
    fun mainactivity() {
        val scan = Scanner(System.`in`);
        println("Введите кол-во персон, более 1");
        var amountPeople = 0;
        amountPeople = scan.nextInt();
        while (amountPeople < 2) {
            println("Введите число больше 1");
            amountPeople = scan.nextInt();
        }
        var array : ArrayList<Counter>;
        var elem : Counter = Counter("",0.0);
        array = elem.counter();
        println("Добавленные товары:");
        var j = 0;
        do {
            array[j].printPosition();
            j++;
        } while (j < array.size);
        var result = elem.calculate(array) / amountPeople;
        println("Каждый должен "+ result);
    }
}
}