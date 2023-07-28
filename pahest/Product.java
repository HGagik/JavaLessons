public class Product{
	private final String name;
	private final double price;
	private final ProductType productType;

	public Product(final String name, double price, final ProductType productType){
	this.name = name;
	this.price = price;
	this.productType = productType;
	}

	public String getName(){
	return this.name;
	}

	public double getPrice(){
	return this.price;
	}

	public ProductType getProductType(){
	return this.productType;
	}
}