package com.einfochips.demomongodb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.demomongodb.Model.Trainee;
import com.einfochips.demomongodb.Repo.TraineeRepo;
@RestController
public class ExternalController {
	 @Autowired
	 TraineeRepo tr;
	 @GetMapping("ext")
	 public List<Trainee> getTrainess(){
	 return tr.findAll();
}
}
