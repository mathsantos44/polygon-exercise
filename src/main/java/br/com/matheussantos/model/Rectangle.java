package br.com.matheussantos.model;

public class Rectangle implements Polygon {

    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getSideA() {
        return sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    @Override
    public Double area() {
        return this.sideA * this.sideB;
    }

    @Override
    public Double perimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

    @Override
    public Double diagonal() {
        return Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
    }
}