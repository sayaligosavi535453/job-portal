
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobController {

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "Welcome to Job Portal!";
    }

    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }
}
