package controllers;

import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ruslan on 14.03.2017.
 */
@Controller
@RequestMapping("/product_detail/*")
public class ProductsController {

    @RequestMapping(method = RequestMethod.GET)
    public String showProduct(@RequestParam("price") int price,@RequestParam("color") String color,
                              @RequestParam("description") String description,Model model) {
        Product product = new Product(price,color,description);
        model.addAttribute("product",product);
        return "product_detail";
    }


}
