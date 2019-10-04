package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-04T03:16:14.853Z")

@RestSchema(schemaId = "project71ll")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project71llImpl {

    @Autowired
    private Project71llDelegate userProject71llDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject71llDelegate.helloworld(name);
    }

}
