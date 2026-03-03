package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(1,"books");
        System.out.println(department);
        Seller seller = new Seller(1,"Guilherme","guiclash4759@gmail.com",new Date(),2000D,department);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);


    }

}
