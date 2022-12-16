package com.example.demo.DTO;

import com.example.demo.Model.InvoiceFundedPojo;
import com.example.demo.Model.InvoiceUnFundedPojo;

import java.util.List;

public class InvoiceDTO {
    List<InvoiceFundedPojo> invoiceFundedList;

    List<InvoiceUnFundedPojo> invoiceUnFundedList;

    public List<InvoiceFundedPojo> getInvoiceFundedList() {
        return invoiceFundedList;
    }

    public void setInvoiceFundedList(List<InvoiceFundedPojo> invoiceFundedList) {
        this.invoiceFundedList = invoiceFundedList;
    }

    public List<InvoiceUnFundedPojo> getInvoiceUnFundedList() {
        return invoiceUnFundedList;
    }

    public void setInvoiceUnFundedList(List<InvoiceUnFundedPojo> invoiceUnFundedList) {
        this.invoiceUnFundedList = invoiceUnFundedList;
    }
}
