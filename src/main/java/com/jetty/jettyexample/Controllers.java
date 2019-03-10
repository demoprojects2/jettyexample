package com.jetty.jettyexample;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {

    @RequestMapping(value = "abc", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> asdf() {
        return ResponseEntity.ok("spring");
    }
}
