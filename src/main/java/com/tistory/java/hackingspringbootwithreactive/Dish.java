package com.tistory.java.hackingspringbootwithreactive;

public class Dish {
	private String description;
	private boolean isDelivered = false;

	public Dish(String description) {
		this.description = description;
	}

	public static Dish deliver(Dish dish) {
		Dish deliverDish = new Dish(dish.description);
		deliverDish.isDelivered = true;
		return deliverDish;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	@Override
	public String toString() {
		return "Dish{" +
			"description='" + description + '\'' +
			", isDelivered=" + isDelivered +
			'}';
	}
}
