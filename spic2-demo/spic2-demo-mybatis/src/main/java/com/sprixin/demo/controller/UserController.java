package com.sprixin.demo.controller;

import com.sprixin.core.model.Result;
import com.sprixin.demo.consumer.UserService;
import com.sprixin.demo.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Result<User> add(User user) {
        userService.save(user);
        Result<User> result = new Result<>();
        result.setMsg("add true");
        return result;
    }

    @PostMapping("/delete")
    public Result<User> delete(@RequestParam Integer id) {
        userService.deleteById(id);
        Result<User> result = new Result<>();
        result.setMsg("delete true");
        return result;
    }

    @PostMapping("/update")
    public Result<User> update(User user) {
        userService.update(user);
        Result<User> result = new Result<>();
        result.setMsg("add true");
        return result;
    }

    @GetMapping("/detail")
    public Result<User> detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        Result<User> result = new Result<>();
        result.setObj(user);
        result.setMsg("detail true");
        return result;
    }

    @GetMapping("/list")
    public Result<List<User>> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) {
        List<User> userList = userService.findAll(page, size);
        Result<List<User>> result = new Result<>();
        result.setObj(userList);
        result.setMsg("detail true");
        return result;
    }
}
