package com.einfo.demotesting.Repo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfo.demotesting.Model.Memeber;

@Repository
public class MemberRepository {
	
	public List<Memeber> getmember(){
		List<Memeber> li = new ArrayList<Memeber>();
		li.add(new Memeber("Shreyasi@12.com","Shreyasi", "34567","f"));
		li.add(new Memeber("Shruti@12.com","Shruti", "3765","f"));
		return li;
		
	}
	
	public Memeber getmemberByEmail(String email) {
		return new Memeber ("Shruti@12.com","Shruti", "3765","f");
	}
}
