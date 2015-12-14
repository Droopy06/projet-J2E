package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.classes.Users;
import project.services.UserService;

import javax.validation.Valid;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
@Controller
public class UsersController {
    @Autowired
    private UserService mUserService;

    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public String ajouterUser(@Valid @ModelAttribute Users user, BindingResult results){
        //request the service
        //Add user after submit form
        mUserService.createUser(user);
        return "redirect:/";
    }
}
