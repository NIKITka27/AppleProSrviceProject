package org.myproject.appleservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = { "/login"}, method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }


    @RequestMapping(value = { "/ipad" }, method = RequestMethod.GET)
    public String iPadPage() {
        return "ipad";
    }

    @RequestMapping(value = { "/iphone" }, method = RequestMethod.GET)
    public String iPhonePage() {
        return "iphone";
    }

    @RequestMapping(value = { "/contact" }, method = RequestMethod.GET)
    public String contactPage() {
        return "contact";
    }

    @RequestMapping(value = { "/accessories" }, method = RequestMethod.GET)
    public String accessoriesPage() {
        return "accessories";
    }


    @RequestMapping(value = {"/", "/home" }, method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }


}
