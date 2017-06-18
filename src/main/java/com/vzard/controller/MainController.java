package com.vzard.controller;

import com.vzard.po.UserEntity;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by V-zar on 2017/4/26.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index2(){
        return "index2";
    }

    @RequestMapping(value = "/index4",method = RequestMethod.POST)

    public  String index3(UserEntity userEntity){

        System.out.println(userEntity.getUsername());
        System.out.println(userEntity.getPassword());
        System.out.println(userEntity.getEmail());

        return "index4";
    }


}
