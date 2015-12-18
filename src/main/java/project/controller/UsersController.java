package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.classes.Url;
import project.classes.Users;
import project.services.UserService;
import project.services.UserServiceImpl;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
@Controller
public class UsersController {
    @Autowired
    private UserService mUserService;

    @RequestMapping(value = "/users/create", method = RequestMethod.GET)
    public ModelAndView create(){
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("users", new Users());
        return new ModelAndView("project/usercreate",model);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@Valid @ModelAttribute Users user, BindingResult results){
        //request the service
        //Add user after submit form
        if(user.getPassword().equals(user.getConfirmPassword())) {
            mUserService.createUser(user);
            return "redirect:/url";
        }
        else{
            System.out.println("les mots de passe sont différents");
            return "redirect:/users/create";
        }

    }

    @RequestMapping(value = "/users/connect", method = RequestMethod.POST)
    public String connect(@Valid @ModelAttribute Users user, BindingResult results){
        //request the service
        //Add user after submit form
        for(int i =0;i<mUserService.listAllUsers().size();i++){
            if(user.getPseudo().equals(mUserService.getUser(i).getPseudo()) && user.getPassword().equals(mUserService.getUser(i).getPassword())){
                return "redirect:/url";
            }
        }
        return "redirect:/";
    }
}
