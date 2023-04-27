package com.kbstar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kbstar.dto.ItemDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tables")
public class ItemController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    String dir = "item/";
    @RequestMapping("")
    public String item(Model model){
        List<ItemDTO> list = new ArrayList<>();
        list.add(new ItemDTO(100,"pants",1000,1,new Date()));
        list.add(new ItemDTO(100,"pants",1000,2,new Date()));
        list.add(new ItemDTO(100,"pants",1000,3,new Date()));
        list.add(new ItemDTO(100,"pants",1000,4,new Date()));
        list.add(new ItemDTO(100,"pants",1000,5,new Date()));

        model.addAttribute("allitem", list);
        model.addAttribute("center", "tables");
//       센터에는 로그인을 뿌려줘
        return "index";
    }

}