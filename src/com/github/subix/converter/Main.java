
/*
 * MIT License
 *
 * Copyright (c) 2017, Max Michalski
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.subix.converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select conversion method:");
        System.out.println("press 1 - celsius to fahrenheit");
        System.out.println("press 2 - fahrenheit to celsius");
        String sc = s.next();
        if (sc.equals("1")) {
            System.out.println("Enter celsius:");
            double celsius = s.nextDouble();
            CelsiusToFahrenheit wynik1 = new CelsiusToFahrenheit(celsius);
            System.out.println("Result: " + (String.format("%.1f", wynik1.calc())) + "°F");
        }

        if (sc.equals("2")) {
            System.out.println("Enter fahrenheit:");
            double fahrenheit = s.nextDouble();
            FahrenheitToCelsius wynik2 = new FahrenheitToCelsius(fahrenheit);
            System.out.println("Result: " + (String.format("%.1f", wynik2.calc())) + "°C");
        }
    }
}
