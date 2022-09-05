package com.example.receiptcounter

import java.util.*

class Counter(var name : String, var price : Double) {
    fun calculate(array : ArrayList<Counter>) : Double {
        var i = 0;
        var result = 0.0;
        while (i < array.size) {
            result += array[i].price;
            i++;
        }
        return result;
    }
    fun printPosition() {
        var d = Math.floor(this.price);
        when (d.toInt() % 20) {
            1 -> {
                println(this.name + ": " + String.format("%.2f", this.price) + " рубль");
            }
            2 -> {
                println(this.name + ": " + String.format("%.2f", this.price) + " рубля");
            }
            3 -> {
                println(this.name + ": " + String.format("%.2f", this.price) + " рубля");
            }
            4 -> {
                println(this.name + ": " + String.format("%.2f", this.price) + " рубля");
            }
            else -> {
                println(this.name + ": " + String.format("%.2f", this.price) + " рублей");
            }
        }
    }

        fun counter(): ArrayList<Counter> {
            var array = ArrayList<Counter>();
            var price: Double = 0.0;
            var closed: String = "";
            var name: String;
            var scan: Scanner = Scanner(System.`in`);
            do {
                println("Введите название товара и цену через Enter (дробные цены вводите через .)");
                name = scan.nextLine();
                while (price <= 0) {
                    try {
                        price = scan.nextLine().toDouble();
                    } catch (e: NumberFormatException) {
                        println("Введите цену!");
                    }
                }
                var buf: Counter = Counter(name, price);
                array.add(buf);
                price = 0.0;
                println("Товар добавлен.");
                println("Добавить товар или завершить?");
                closed = scan.nextLine();
            } while (!(closed.equals("Завершить", true)))
            return array;
        }
    }

