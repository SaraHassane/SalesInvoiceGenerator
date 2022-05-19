package model;

import java.util.ArrayList;

public class theInvoice {
    
    private ArrayList<theLineOfTheData> theLines;
    
    //Private variable
    private int theNumberOfTheCustomer;
    private String theDateOfTheInvoice, theCustomerName;

    public theInvoice() {
    }

    public theInvoice(int theNumberOfTheCustomer, String theDateOfTheInvoice, String theCustomerName) {
        this.theNumberOfTheCustomer = theNumberOfTheCustomer;
        this.theDateOfTheInvoice = theDateOfTheInvoice;
        this.theCustomerName = theCustomerName;
    }

    public int getTheNumberOfTheCustomer() {
        return theNumberOfTheCustomer;
    }

    public void setTheNumberOfTheCustomer(int theNumberOfTheCustomer) {
        this.theNumberOfTheCustomer = theNumberOfTheCustomer;
    }

    public String getTheDateOfTheInvoice() {
        return theDateOfTheInvoice;
    }

    public void setTheDateOfTheInvoice(String theDateOfTheInvoice) {
        this.theDateOfTheInvoice = theDateOfTheInvoice;
    }

    public String getTheCustomerName() {
        return theCustomerName;
    }

    public void setTheCustomerName(String theCustomerName) {
        this.theCustomerName = theCustomerName;
    }

    
}
