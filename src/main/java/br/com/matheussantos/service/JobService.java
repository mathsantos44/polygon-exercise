package br.com.matheussantos.service;

import br.com.matheussantos.model.Rectangle;

import java.util.Scanner;

public class JobService {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");

        Double width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");

        Double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
    }
}