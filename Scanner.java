package com.company;

public class Scanner extends Printer {

    private int paper;


    public void scan(int tonerLevel){
        if(getTonerLevel() < 0){
            System.out.println("System needs toner before scanning");
        } else if (paper <= 0){
            System.out.println("System needs paper before scanning");
        } else {
            System.out.println("Scanning documents.");
        }
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }
}
