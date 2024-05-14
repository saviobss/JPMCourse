package oop_polymorphism;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1 ;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount < 101 && tonerAmount > 0) {
            int tempAmount = this.tonerLevel + tonerAmount;
            if(tempAmount > 100 || tempAmount < 0) {
                return -1;
            }
        } else {
            return -1;
        }

        return this.tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        int jobPages = (this.duplex) ? pages/2 + (pages % 2): pages;
        if(this.duplex) {
            System.out.println("This is a duplex printer");
        }
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

}
