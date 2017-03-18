package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 17-3-16.
 */
@RestController
public class ConsumerRibbonController {
  @Autowired
  public RibbonService service;

    @RequestMapping(value = "/addInRibbon", method = RequestMethod.GET)
    public String add() {
        return service.addService();
    }

}
