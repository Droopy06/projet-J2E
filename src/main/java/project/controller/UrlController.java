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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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

    @RequestMapping(value = "/url/add", method = RequestMethod.POST)
    public String addUrl(@ModelAttribute Url url, BindingResult results){
        //request the service
        //Add url after submit form
        if(urlIsValid(url.getLongUrl())){
            mUrlService.createUrl(url);
        }
        return "redirect:/url/create";
    }

    private boolean urlIsValid(String urlBase) {
        try {
            URL url = new URL(urlBase);
            URLConnection conn = url.openConnection();
            conn.connect();
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            // return false; // Si on veut tester si la page est une 404
            return true;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
