package org.example;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        Login login = new Login();
        login.LoginMethod();

        UtbildningsPlan utbildningsplan = new UtbildningsPlan();
        utbildningsplan.UtbildningsPlanMethod();

        FindTheTest findthetest = new FindTheTest();
        findthetest.TestMethod();


    }
}