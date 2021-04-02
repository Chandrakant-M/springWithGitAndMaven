package com.cm;

public class Tyre {
	public Tyre() {
		System.out.println("tyre ctor called");
	}

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return this.brand;
	}

}
