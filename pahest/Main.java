import java.util.*;
public class Main{
	public static void main(String[] args){
		final String shopName = "Diana";
		final String jacetName = "Jaket";
		final String cardiganName = "Cardigan";
		final String trousersName = "Trousers";
		double price = 1800;
		int countOfProducts = 3;
		List<Product> products = new ArrayList<>();

		WearHouse pahest = new WearHouse(products,countOfProducts);
		Product jacet = new Product(jacetName,price,ProductType.CLOTHES);
		Product cardigan = new Product(cardiganName,price,ProductType.CLOTHES);
		Product trousers = new Product(trousersName,price,ProductType.CLOTHES);
		Product trousersFromOherWearHouse = new Product(trousersName,price,ProductType.CLOTHES);
		Shop clothesShop = new Shop(shopName,products,ShopType.CLOTHES);


		pahest.giveProductToShop(clothesShop,jacet);
	    pahest.giveProductToShop(clothesShop,cardigan);
		pahest.giveProductToShop(clothesShop,trousers);

		clothesShop.sellProduct(jacet);
				

		pahest.takeProductFromShop(clothesShop,jacet);

		
		clothesShop.takeProductback(jacet);




		System.out.println(clothesShop.getProducts().size());


	}
}