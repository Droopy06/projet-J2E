package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.classes.Url;
import project.services.UrlService;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
@Controller
public class UrlController {

    @Autowired
    private UrlService mUrlService;

    @RequestMapping(value = "/url", method = RequestMethod.GET)
    public ModelAndView urlByUser(){
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("service", mUrlService.listAllUrl());
        return new ModelAndView("project/urllist",model);
    }

    @RequestMapping(value = "/url/create", method = RequestMethod.GET)
    public ModelAndView createNewUrl(){
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("url", new Url());
        return new ModelAndView("project/urlcreate",model);
    }

    @RequestMapping(value = "/url/add", method = RequestMethod.GET)
    public String addUrl(@Valid @ModelAttribute Url url, BindingResult results){
        //request the service
        //Add url after submit form
        mUrlService.createUrl(url);
        return "project/url/create";
    }
}
