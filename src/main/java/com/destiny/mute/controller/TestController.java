package com.destiny.mute.controller;

import com.destiny.mute.base.bean.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("/hello/{p1}/{p2}")
    public Result test(@PathVariable String p1, @PathVariable int p2, @RequestParam String p3, @RequestParam(value = "p4", defaultValue = "testP4") String p4) {
        return new Result(200, "SUCCESS", 1, "p1=" + p1 + ",p2=" + p2 + ",p3=" + p3 + ",p4=" + p4);
    }

    @RequestMapping("/hello")
    public Result test(@RequestParam String p3, @RequestParam String p4) {
        return new Result(200, "SUCCESS", 1, "");
    }
}
