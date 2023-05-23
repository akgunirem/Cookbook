package cookbook;

public class IngredientNode {

	private String measurement; // stores ingredient's measurement data
	private String ingredient; // stores ingredient's name data
	private IngredientNode next; 
	
	public IngredientNode(String measurement, String ingredient) {
		super();
		this.ingredient = ingredient;
		this.measurement = measurement;
		this.next=null;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	public void setNext(IngredientNode next) {
		this.next = next;
	}
	public String getIngredient() {
		return ingredient;
	}
	public String getMeasurement() {
		return measurement;
	}
	public IngredientNode getNext() {
		return next;
	}
	
}
