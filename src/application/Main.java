package application;

import model.dao.DaoFactory;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Seller seller = DaoFactory.createSellerDao().findById(2);
		System.out.println(seller);
	}
}
