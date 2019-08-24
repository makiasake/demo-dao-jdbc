package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Seller findById");
		Seller seller = DaoFactory.createSellerDao().findById(2);
		System.out.println(seller);
		
		System.out.println("Seller findByDepartment");
		List<Seller> list = DaoFactory.createSellerDao().findByDepartment(new Department(2, null));
		for (Seller s: list) {
			System.out.println(s);
		}
	}
}
