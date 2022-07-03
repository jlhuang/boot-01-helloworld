package com.jlhuang.controller;

import com.jlhuang.bean.User;
import com.jlhuang.dto.UserSearchRequest;
import com.jlhuang.mapper.UserMapper;
import com.jlhuang.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Slf4j
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/id_search")
    public String handleHelloWorld(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
        //log.info("log test");
        User user = userService.getUser(userSearchRequest.getId());
        model.addAttribute("userInfo",user);
        return "index";
    }
}
