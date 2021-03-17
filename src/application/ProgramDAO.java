package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class ProgramDAO {

	public static void main(String[] args) {
		Department dep = new Department(1, "Fiscal");
		System.out.println(dep);
		
		Seller seller = new Seller(21, "Juju Cardoso", "juju@gmail.com", new Date(), 4000.0, dep);
		System.out.println();
		System.out.println(seller);
	}
}
