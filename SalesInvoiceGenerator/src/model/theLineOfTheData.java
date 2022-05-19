
package model;


public class theLineOfTheData {
    // define variables
    private theInvoice The_Invoice;
    private int theNumberOfTheInvoice, theNumberOfTheItems;
    private String theNameOfTheItem;
    private double thePriceOfTheItem;

    
    public theLineOfTheData() {
    }

    public theLineOfTheData(theInvoice The_Invoice, int theNumberOfTheInvoice, int theNumberOfTheItems, String theNameOfTheItem, double thePriceOfTheItem) {
        this.The_Invoice = The_Invoice;
        this.theNumberOfTheInvoice = theNumberOfTheInvoice;
        this.theNumberOfTheItems = theNumberOfTheItems;
        this.theNameOfTheItem = theNameOfTheItem;
        this.thePriceOfTheItem = thePriceOfTheItem;
    }
    
    // The getter annd the setter
    public double getPrice() {
        return thePriceOfTheItem;
    }

    public void setPrice(double price) {
        this.thePriceOfTheItem = price;
    }

    public int getNumberOfTheInvoice() {
        return theNumberOfTheInvoice;
    }

    public void setNumberOfTheInvoice(int numberOfTheInvoice) {
        this.theNumberOfTheInvoice = numberOfTheInvoice;
    }

    public int getTheNumberOfTheItems() {
        return theNumberOfTheItems;
    }

    public void setTheNumberOfTheItems(int theNumberOfTheItems) {
        this.theNumberOfTheItems = theNumberOfTheItems;
    }

    public String getTheNameOfTheItem() {
        return theNameOfTheItem;
    }

    public void setTheNameOfTheItem(String theNameOfTheItem) {
        this.theNameOfTheItem = theNameOfTheItem;
    }
    
    
    
    
}
