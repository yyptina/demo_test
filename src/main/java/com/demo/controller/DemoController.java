package com.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {
    private static final Log LOG = LogFactory.getLog(DemoController.class);


    @ResponseBody
    @GetMapping("/getInfo")
    public Map<String, Object> getInfo() throws Exception {
        LOG.info("access requestService");
        Map<String, Object> response = new HashMap<>();

        response.put("result", 1);
        response.put("msg", "hello world");

        return response;
    }

}
