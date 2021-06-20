package pkg.controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import pkg.beans.Address;
//import pkg.beans.Person;

//import com.example.demo.actuatorservice.Greeting;

@Controller
public class PersonController {
	
	private final AtomicLong counter = new AtomicLong();
	
//	ArrayList<Person> personList = new ArrayList<Person>();
//	
//	@GetMapping("/hello-world")
//	@ResponseBody
//	public Person sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
//		
//		Person person = new Person();
//		
//		person.setUserName(name);
//		
//		return person;
//	}
//
//	@PostMapping("/addPerson")
//	@ResponseBody
//	public Person addUser(@RequestBody Person person) {
//		
////		personList.add(new Person((int)counter.incrementAndGet(),
////				person.getUserName(), 
////				person.getPassword(), 
////				person.getEmail(), 
////				person.getAddress().getAddressStreet(),
////				person.getAddress().getAddressNumber()));
//		
//		person.setUserId((int)counter.incrementAndGet());
//		
//		personList.add(person);
//		
//		return person;
//		
//	}
//	
//	@RequestMapping("/getPersons")
//	@ResponseBody
//	public ArrayList<Person> getUsers() {
//			
//		return personList;
//		
//	}

}
