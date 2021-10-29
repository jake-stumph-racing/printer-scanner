package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(){
        //no arg constructor f/ scanner class to test basic functionality
    }
    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void tonerRefill(){
        System.out.println("Toner refilled");
        tonerLevel = 100;
    }

    public void printing(int pagesBeingPrinted){
        if(duplexPrinter){
            pagesPrinted += ((pagesBeingPrinted / 2) + (pagesBeingPrinted % 2));
            pagesBeingPrinted = ((pagesBeingPrinted / 2) + (pagesBeingPrinted % 2));
            System.out.println("You saved paper, and the planet by using the duplex printer." +
                    "Pages printed = " + pagesBeingPrinted);
        } else{
            pagesPrinted += pagesBeingPrinted;
            pagesBeingPrinted = pagesBeingPrinted;
            System.out.println("Have you considered using a duplex printer? It saves paper, and is " +
                    "better for the planet. Pages printed = " + pagesBeingPrinted);
        }
        this.tonerLevel -= pagesBeingPrinted * 2;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }
}
