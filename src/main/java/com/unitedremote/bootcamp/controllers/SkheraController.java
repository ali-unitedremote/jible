package com.unitedremote.bootcamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedremote.bootcamp.dao.SkheraDao;
import com.unitedremote.bootcamp.models.Skhera;

@RestController
@RequestMapping("/skheras")
public class SkheraController {

	@Autowired
	SkheraDao skheraDao;

	@PostMapping("/save")
	public Skhera CreateSkhera(@RequestBody Skhera skhera) {
		return skheraDao.save(skhera);
	}
}
