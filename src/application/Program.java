package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("===== TEST 1 : Seller findById =====");
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);
        System.out.println("===== TEST 2 : Seller findByDepartment =====");
        Department department = new  Department(2,null);
        List<Seller> list=sellerDao.findByDepartment(department);
        for (Seller seller : list) {
            System.out.println(seller);
        }
        System.out.println("===== TEST 3 : Seller findAll =====");
        list=sellerDao.findAll();
        for (Seller seller : list) {
            System.out.println(seller);
        }
       System.out.println("===== TEST 4 : Seller insert =====");
       Seller seller3 = new  Seller(null,"Greg2","Greg@gmail.com",new Date(),4000D,department);
       sellerDao.insert(seller3);
       System.out.println("Insert! new id = "+seller3.getId());

        System.out.println("===== TEST 5 : Seller update =====");
        seller3 = sellerDao.findById(1);
        seller3.setNome("Pelé");
        sellerDao.update(seller3);
        System.out.println("Updated!");

        System.out.println("===== TEST 6 : Seller Delete =====");
        sellerDao.deleteById(14);
        System.out.println("Deleted!");


    }

}
