package com.bridgelabz.pages;

import com.bridgelabz.base.BaseClass;

public class HomePage extends BaseClass {
    public String verifyTitle() {
        return driver.getTitle();
    }
    public void closeDriver(){
        driver.close();
    }
}
