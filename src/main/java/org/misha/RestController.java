package org.misha;

import org.misha.impl.MishaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class RestController {
    private final MishaServiceImpl mishaService;

    @Autowired
    public RestController(final MishaServiceImpl mishaService) {
        this.mishaService = mishaService;
    }

    @RequestMapping(value = "request/for/misha", method = RequestMethod.GET)
    @ResponseBody
    public String call(@RequestParam(value = "misha") String value) {
        return mishaService.getMisha(value);
    }
}
