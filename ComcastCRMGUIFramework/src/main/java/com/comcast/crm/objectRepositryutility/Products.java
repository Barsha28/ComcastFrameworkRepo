package com.comcast.crm.objectRepositryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products {
@FindBy(xpath = "//img[@title='Create Product...']")
private WebElement createProduct;

@FindBy(name="search")
private WebElement ele2;
}

