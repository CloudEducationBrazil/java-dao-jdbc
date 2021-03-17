package application;

//import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
//import model.entities.Department;
import model.entities.Seller;

public class ProgramDAO {

	public static void main(String[] args) {
		// Testando as Classes
		/*Department dep = new Department(1, "Fiscal");
		System.out.println(dep);
		
		Seller seller = new Seller(21, "Juju Cardoso", "juju@gmail.com", new Date(), 4000.0, dep);
		System.out.println();
		System.out.println(seller);*/
		
		// O programa não conhece a implementação só conhece somente a Interface.
		// É uma forma de fazer uma injeção de dependência sem explicitar a implementação. 
		// Ele chama a Fábrica Dao.
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
