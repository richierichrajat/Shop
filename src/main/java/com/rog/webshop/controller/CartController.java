package com.rog.webshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/cart")
public class CartController {


    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public String getCart(@PathVariable(value = "cartId") String cartId , ModelMap model){
        System.out.println("Kontroler getcart w /cart " + cartId);

        model.addAttribute("cartId", cartId);
        return "cart";
    }

    @RequestMapping
    public String get(HttpServletRequest request){

        System.out.println("Kontroler get w /cart");

        return "redirect:/cart/" + request.getSession().getId();
    }
}
