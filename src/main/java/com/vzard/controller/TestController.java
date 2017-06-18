package com.vzard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by V-zar on 2017/4/27.
 */


@Controller
public class TestController  {

    @RequestMapping(value = "index3",method = RequestMethod.GET )
    public String index3(){
        return "index3";
    }


}
