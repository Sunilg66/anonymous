package com.sunil.fuctional.dto;

import com.sunil.fuctional.constants.FishType;

public class FishDTO {
	
	private String name;
	private String color;
	private FishType type;
	private int lifespan;
	private double cost;
	private String gender;
	
	public FishDTO() {
		System.out.println("created fishdto constructor");
	}

	public FishDTO(String name, String color, FishType type, int lifespan, double cost, String gender) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifespan = lifespan;
		this.cost = cost;
		this.gender = gender;
	}
	
	

	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifespan=" + lifespan + ", cost="
				+ cost + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
