package lamdasandstreamapi;

import model.Invoice;
import model.Month;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyAwesomeLambdas {

    public static void main(String[] args) {

        List<Invoice> invoices = new ArrayList<>();
        int total = 0;

        Invoice invoice1 = new Invoice("I001",1000,Month.MARCH);
        Invoice invoice2 = new Invoice("I002",55.5,Month.MARCH);
        Invoice invoice3 = new Invoice("I003",470,Month.MARCH);
        Invoice invoice4 = new Invoice("I004",8958.5,Month.MARCH);
        Invoice invoice5 = new Invoice("I005",10000,Month.MARCH);

        invoices.addAll(Arrays.asList(invoice1,invoice2,invoice3,invoice4,invoice5));

        //foreach
        for(Invoice invoice : invoices){

            total += (int)invoice.getAmount();
        }
        System.out.println("Total is: "+ total);

        //Lambda expresion with stream api
        double otherTotal = invoices.stream().filter(inv -> inv.getMonth() == (Month.MARCH)).mapToDouble(Invoice::getAmount).sum();


        System.out.println("Other Total is: "+ otherTotal);

    }
}
