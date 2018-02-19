package com.christodd;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(100, true);
	printer.printNumberOfPages(50);
	printer.fillUpToner(60);
	printer.printNumberOfPages(30);
	printer.fillUpToner(30);
	printer.printNumberOfPages(18);
    }
}
