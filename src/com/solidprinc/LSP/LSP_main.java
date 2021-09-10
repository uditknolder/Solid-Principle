package com.solidprinc.LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LSP_main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Udit",new Date()));
        myList.add(new AnnualMember("Raj",new Date()));
        myList.add(new EnquiryUser("Knolder"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }
}
