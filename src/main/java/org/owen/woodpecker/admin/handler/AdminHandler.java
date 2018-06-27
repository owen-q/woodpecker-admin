package org.owen.woodpecker.admin.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by owen_q on 2018. 6. 18..
 */

@Controller
public class AdminHandler {
    private Logger logger = LoggerFactory.getLogger(AdminHandler.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("name", "owen");

        return "index";
    }
}
