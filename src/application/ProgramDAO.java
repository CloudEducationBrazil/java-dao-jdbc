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
		
		// O programa n�o conhece a implementa��o s� conhece somente a Interface.
		// � uma forma de fazer uma inje��o de depend�ncia sem explicitar a implementa��o. 
		// Ele chama a F�brica Dao.
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
