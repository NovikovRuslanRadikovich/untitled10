package controllers;

import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

 /**
 * Created by ruslan on 14.03.2017.
 */
@Controller
public class MainController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getProducts(Model model) {
           System.out.println("fuck");
           List<Product> products = new ArrayList();
           Product product1 = new Product(15,"red","Very red");
           Product product2 = new Product(24,"green","Very green");
           Product product3 = new Product(36,"yellow","Very yellow");
           products.add(product1);
           products.add(product2);
           products.add(product3);
           model.addAttribute("products",products);
           System.out.println("Fuck");
           return "catalog";

    }

}
