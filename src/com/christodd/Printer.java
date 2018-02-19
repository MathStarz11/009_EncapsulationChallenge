package com.christodd;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplexPrinter;
    private int duplexSidePrinted;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel > 0 && tonerLevel <= 0) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexSidePrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int x) {
        tonerLevel = tonerLevel + x;
        if(tonerLevel > 100) {
            tonerLevel = 100;
        }
        System.out.println("You have filled up the toner to a level of: "
        + tonerLevel);
    }

    public void printNumberOfPages(int x) {
        pagesPrinted += x;
        if(isDuplexPrinter) {
            duplexSidePrinted = duplexSidePrinted + x/2;
        }
        tonerLevel -= x;
        System.out.println("Printing " + x + " pages\n" +
                "Total pages printed: " + pagesPrinted + "\n" +
                "Total duplex side printed: " + duplexSidePrinted + "\n" +
                "Toner Left " + tonerLevel + "");
    }


}
