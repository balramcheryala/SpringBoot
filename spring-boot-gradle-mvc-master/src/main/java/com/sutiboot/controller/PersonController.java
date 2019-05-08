package com.sutiboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sutiboot.domain.Person;
import com.sutiboot.service.PersonService;

/**
 * @className:com.sutiboot.controller.PersonController.java
 * @author <a href="mailto:balramc@****.**">Balram</a>
 * @date May 8, 2019 11:12:15 AM
 * @description:
 */
@Controller
@RequestMapping(value = {"","/person"})
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = {"/","index"})
    public String index(Model model){
        System.out.println(personService.findAll());
        model.addAttribute("persons", personService.findAll());
        return "person/index";
    }

    @RequestMapping(value = "create")
    public String create(){
        return "person/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Person person){
        personService.save(person);
        return "redirect:index";
    }

    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("person",personService.findById(id));
        return "person/edit";
    }
    
    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable Long id, Model model){
    	personService.delete(id);
    	model.addAttribute("msg","Deleted Successfully");
        return "person/delete";
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Person person){
        personService.save(person);
        return "redirect:index";
    }

 }
