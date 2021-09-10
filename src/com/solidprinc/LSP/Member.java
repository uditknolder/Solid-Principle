package com.solidprinc.LSP;

import java.util.Date;

public abstract class Member {
    String name;
    String memberType;
    Date mStartDate;
    Date mEndDate;

    public Member (String name){
        this.name = name;
    }

    public abstract void addToDatabase();
}
