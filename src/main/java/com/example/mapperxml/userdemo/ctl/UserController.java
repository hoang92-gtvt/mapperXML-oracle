package com.example.mapperxml.userdemo.ctl;

import com.example.mapperxml.common.baseModel.NCCommonSVO;
import com.example.mapperxml.userdemo.service.IUserDemoService;
import com.example.mapperxml.userdemo.svo.UsersDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private IUserDemoService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("/index");
        return mav;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("/views/home");
        return mav;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView listUsers1(UsersDemo param) {
        ModelAndView mav = new ModelAndView("/views/list");
        List<NCCommonSVO> userList = userService.selList(param);
//        List<UsersDemo> list = userList.stream().map(
//                element->(UsersDemo)element
//                ).collect(Collectors.toList());
        mav.addObject("list", userList);


        return mav;
    }
}