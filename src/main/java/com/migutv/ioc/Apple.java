package com.migutv.ioc;

import java.io.Serializable;

public class Apple implements Serializable{
private String color;
private String price;
public Apple()
{
	}

public Apple(String color,String price)
{this.color=color;
this.price=price;
	}


public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String toString() {

return "color =" + this.color + ", size = " + this.price ;

}
public void print(int str)
{System.out.println(str+"print successfully");
	}
}
