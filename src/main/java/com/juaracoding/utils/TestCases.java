package com.juaracoding.utils;

public enum TestCases {

    T1("User dapat berhasil login dengan menggunakan kredensial yang valid"),
    T2("Sistem menangani skenario di mana user mencoba login dengan menggunakan kredensial yang salah");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}