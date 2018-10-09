package org.misha;

import org.misha.serializer.MishaSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class MishaController {
    private final MishaService mishaService;

    @Autowired
    public MishaController(final MishaService mishaService) {
        this.mishaService = mishaService;
    }

    @RequestMapping(value = "request/for/misha", method = RequestMethod.GET)
    @ResponseBody
    public String getMisha(@RequestParam(value = "misha") final String value) {
        return new MishaSerializer().serialize(mishaService.response(value));
    }
}
