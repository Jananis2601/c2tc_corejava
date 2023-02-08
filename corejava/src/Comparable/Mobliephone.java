package Comparable;
import java.util.*;
public class Mobilephone implements Comparable<Mobilephone>{
private String model;
private int price;
private int ram;
public String getmodel() {
	return model;
}
public String setmodel(String model) {
	this.model= model;;
}
public int getprice() {
	return price;
}
public int setprice(int price) {
	this.price =price;
}
public int getram() {
	return ram;
}
public String setram(int ram) {
	this.ram= ram;
}
@Override
public int compareTo(Mobilephone o) {
	// TODO Auto-generated method stub
	return 0;
}

	
	

	
	

	}



