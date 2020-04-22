package com.destiny.mute.controller;

import com.destiny.mute.base.bean.BaseBean;
import com.destiny.mute.base.bean.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Api(tags = { "测试Controller"})
public class TestController {

    @RequestMapping(value = "/hello/{p1}/{p2}", method = RequestMethod.GET)
    public Result test(@PathVariable String p1, @PathVariable int p2, @RequestParam String p3, @RequestParam(value = "p4", defaultValue = "testP4") String p4) {
        return new Result(200, "SUCCESS", 1, "p1=" + p1 + ",p2=" + p2 + ",p3=" + p3 + ",p4=" + p4);
    }

    @ApiOperation(value = "方法一", notes = "方法一说明及注意事项")
    @ApiImplicitParams({@ApiImplicitParam(name = "p3", value = "参数一"),
            @ApiImplicitParam(name = "p4", value = "参数er", defaultValue = "p44444")})
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Result test(@RequestParam String p3, @RequestParam String p4) {
        return new Result(200, "SUCCESS", 1, "p3=" + p3 + ",p4=" + p4);
    }

    @RequestMapping(value = "/body", method = RequestMethod.POST)
    @ApiImplicitParam(name="bean", value = "实例参数")
    public BaseBean  test(@RequestBody BaseBean bean){
        return bean;
    }
}
