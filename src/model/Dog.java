package model;

public class Dog extends Animal{
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Dog [raca=" + raca + "]";
	}

}
	


	