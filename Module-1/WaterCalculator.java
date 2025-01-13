/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.watercalculator;

// Adrian Marquez
// 01/12/2025
// Module 1.3

// This Java program will calculate the energy needed to heat water from an initial temp to a final temp.

import java.util.Scanner;

public class WaterCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of  water in kg:");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temp in celcius:");
        double initialTemp = scanner.nextDouble();

        System.out.print("Enter the final temp in celcius:");
        double finalTemp = scanner.nextDouble();

        double energyNeeded = waterMass * (finalTemp - initialTemp) * 4184;

        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energyNeeded);

        scanner.close();
    }
}
