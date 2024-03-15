package fp.dam.examenes;

public class OrderDetail {
	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private float priceEach;
	private int orderLineNumber;
	
	public OrderDetail(int orderNumber, String productCode, int quantityOrdered, float priceEach, int orderLineNumber) {
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public OrderDetail(String csvLine) {
		String [] tokens = csvLine.split("\\|");
		orderNumber = Integer.parseInt(tokens[0]);
		productCode = tokens[1];
		quantityOrdered = Integer.parseInt(tokens[2]);
		priceEach = Float.parseFloat(tokens[3]);
		orderLineNumber = Integer.parseInt(tokens[4]);	
	}	
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public float getPriceEach() {
		return priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	
	@Override
	public String toString() {
		return "OrderDetail [" + orderNumber + ", " + productCode + ", " + quantityOrdered +
				", " + priceEach + ", " + orderLineNumber + "]";
	}
	
}