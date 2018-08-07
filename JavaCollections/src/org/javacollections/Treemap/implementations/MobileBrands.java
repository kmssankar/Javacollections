package org.javacollections.Treemap.implementations;

public class MobileBrands {
	Integer id;
	String brand;
	String origin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public MobileBrands(Integer id, String brand, String origin) {
		super();
		this.id = id;
		this.brand = brand;
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "MobileBrands [id=" + id + ", brand=" + brand + ", origin=" + origin + "]";
	}
	
}
