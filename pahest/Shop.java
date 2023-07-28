import java.util.*;
public class Shop{
	private final String name;
	private final List<Product> products;
	private final List<Product> selledProducts = new ArrayList<>();
	private final ShopType shopType;


	public Shop(final String name,final List<Product> products,final ShopType shopType){
	this.name = name;
	this.products = products;
	this.shopType = shopType;
	}

	public String getName(){
		return this.name;
	}

	public List<Product> getProducts(){
		return this.products;
	}

	public ShopType getShopType(){
		return this.shopType;
	}

	public List<Product> getSelledProducts(){
		return this.selledProducts;
	}


	public List<Product>  sellProduct(Product product){
		if(this.getProducts().contains(product)){
            this.products.remove(product);
            this.selledProducts.add(product);

		}else {
			System.out.println("WE don't have right now");
		}
		return selledProducts;


	}

	

	public void takeProductback(Product product){
			if(this.getSelledProducts().contains(product)){
            this.products.add(product);
            this.selledProducts.remove(product);

		}else {
			System.out.println("Not ours");
		}
	}
	}

