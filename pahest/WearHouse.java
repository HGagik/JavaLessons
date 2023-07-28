import java.util.*;
public class WearHouse{
	private final List<Product> products;
	private int countOfProducts;

	public WearHouse(final List<Product> products,int countOfProducts){
	this.products = products;
	this.countOfProducts = countOfProducts;
	}

	public List<Product> getProducts(){
	return this.products;
	}

	public int getCountOfProducts(){
	return this.countOfProducts;
	}

	public void giveProductToShop(Shop shop, Product product){
		if(countOfProducts > 0){
			if(shop.getShopType().name() == product.getProductType().name()){
			countOfProducts--;
            shop.getProducts().add(product);

		}else {
			System.out.println("Not for you");
		}
		
	}else {
		System.out.println("Try next time");
	}
	}

	public void takeProductFromShop(Shop shop, Product product){
		if(shop.getProducts().contains(product)){
			countOfProducts++;
            shop.getProducts().remove(product);

		}else {
			System.out.println("It is not from us");
		}
	}
}