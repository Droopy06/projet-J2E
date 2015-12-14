package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
@Controller
public class ProjectController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String accueil() {
        return "project/accueil";
    }
}
