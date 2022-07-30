package com.jlhuang.controller;

import com.jlhuang.bean.User;
import com.jlhuang.dto.UserListParam;
import com.jlhuang.dto.UserSearchRequest;
import com.jlhuang.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/id_search")
    public String handleIdSearch(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
        //log.info("log test");
        User user = userService.getUser(userSearchRequest.getId());
        model.addAttribute("userInfo",user);
        return "index";
    }

    @GetMapping("/user/all_search")
    public String handleAllSearch(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("allUserInfo",allUser);
        return "detail";
    }

    @GetMapping("/user/change")
    public String handleChange(Model model) {
        List<User> allUser = userService.getAllUser();
        UserListParam userListParam = new UserListParam(allUser);
        model.addAttribute("userListParam",userListParam);
        List<String> names = new ArrayList<String>();
        names.add("Jack");
        names.add("John");
        names.add("Ben");
        names.add("Tom");
        names.add("Monica");
        names.add("Marry");
        model.addAttribute("optionNames", names);
        return "edit";
    }

    @PostMapping("/user/change_all")
    public String handleChangAll(@ModelAttribute UserListParam userListParam, Model model) {
        userService.updateAllUser(userListParam.getUserList());
        return "redirect:/user/all_search";
    }
}
