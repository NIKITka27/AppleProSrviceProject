package org.myproject.appleservice.controller;

import org.myproject.appleservice.Repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
@SessionAttributes("device")
public class RequestController {

    @Autowired
    RequestRepository requestRepository;

}
