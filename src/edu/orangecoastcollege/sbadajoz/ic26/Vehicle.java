package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Vehicle {
	protected String mManufacturer;
	protected int mNumberCylinder;
	protected int mHorsepower;
	protected Person mOwner;
	
	public Vehicle(String manufacturerName, int numberCylinder, int horsepower, Person owner) {
		mManufacturer = manufacturerName;
		mNumberCylinder = numberCylinder;
		mHorsepower = horsepower;
		mOwner = owner;
	}
	
	public Vehicle(Vehicle other) {
		mManufacturer = other.mManufacturer;
		mNumberCylinder = other.mNumberCylinder;
		mHorsepower = other.mHorsepower;
		mOwner = other.mOwner;
	}

	public String getManufacturer() {
		return mManufacturer;
	}

	public int getNumberCylinder() {
		return mNumberCylinder;
	}

	public int getHorsepower() {
		return mHorsepower;
	}

	public Person getOwner() {
		return mOwner;
	}

	public void setManufacturer(String manufacturer) {
		this.mManufacturer = manufacturer;
	}

	public void setNumberCylinder(int numberCylinder) {
		this.mNumberCylinder = numberCylinder;
	}

	public void setHorsepower(int horsepower) {
		this.mHorsepower = horsepower;
	}

	public void setOwner(Person owner) {
		this.mOwner = owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mHorsepower;
		result = prime * result
				+ ((mManufacturer == null) ? 0 : mManufacturer.hashCode());
		result = prime * result + mNumberCylinder;
		result = prime * result + ((mOwner == null) ? 0 : mOwner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (mHorsepower != other.mHorsepower)
			return false;
		if (mManufacturer == null) {
			if (other.mManufacturer != null)
				return false;
		} else if (!mManufacturer.equals(other.mManufacturer))
			return false;
		if (mNumberCylinder != other.mNumberCylinder)
			return false;
		if (mOwner == null) {
			if (other.mOwner != null)
				return false;
		} else if (!mOwner.equals(other.mOwner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + mManufacturer + ", numberCylinder="
				+ mNumberCylinder + ", horsepower=" + mHorsepower + ", owner="
				+ mOwner + "]";
	}
	
	
}
