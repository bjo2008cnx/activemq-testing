package com.github.activemq.controller;

import com.github.activemq.respone.ResultRespone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ResultRespone index() {
        ResultRespone respone = new ResultRespone();
        respone.setData("欢迎来到我的界面");
        return respone;
    }

}
