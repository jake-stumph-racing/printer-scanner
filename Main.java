package com.company;



public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(100, 0, true);

        printer.printing(9);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());

        Printer printer2 = new Printer(100, 0, false);

        printer2.printing(10);
        System.out.println(printer2.getTonerLevel());
        printer2.tonerRefill();
        System.out.println(printer2.getTonerLevel());
        System.out.println(printer2.getPagesPrinted());

        Scanner scanner = new Scanner();

        scanner.setPaper(10);

        scanner.scan(printer.getTonerLevel());

    }

}

