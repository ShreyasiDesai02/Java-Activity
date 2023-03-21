package com.einfochips.demomongodb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.demomongodb.Model.Trainee;
import com.einfochips.demomongodb.Repo.TraineeRepo;



@RestController
public class TraineeController {
	@Autowired
	TraineeRepo tr;
	
@RequestMapping("insertTrainee")
public ModelAndView insertTrainee() {
	ModelAndView mv = new ModelAndView("success");
	Trainee t = new Trainee(3,"Shreyasi","Pune");
	tr.save(t);
	return mv;
	
}

//@RequestMapping("insertTrainee")
//public String insertTrainee() {
//
//	tr.save(new Trainee(212,"Akshay", "pune"));
//	System.out.println(tr);
//	return "hello";
//	
//}



@RequestMapping("viewTrainee")
public List<Trainee> gettrainee(){
	return tr.findAll();
}

@RequestMapping("updateTrainee")
public Trainee updateTrainee(){
	return tr.save(new Trainee(1,"Shreyasi","Viramgam"));
}

@RequestMapping("countTrainee")
public long countTrainee(){
	return tr.count();
}
}
