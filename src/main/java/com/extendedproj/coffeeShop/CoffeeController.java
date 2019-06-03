package com.extendedproj.coffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.extendedproj.coffeeShop.entity.Item;
import com.extendedproj.coffeeShop.entity.Users;




@Controller
public class CoffeeController {
	
	@Autowired
	ItemRepository item;
	UsersRepository user;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("Index");
	}
	
	@RequestMapping("add-item")
	public ModelAndView addNewItem(@RequestParam("name") String n, @RequestParam("description") String d, @RequestParam("quantity")
	Integer q, @RequestParam("price") Double p) {
		
		item.save(new Item (n, d, q, p));
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("delete-item")
	public ModelAndView deleteItem(@RequestParam("id") int id) {
		item.deleteById(id);
		return new ModelAndView ("redirect:/");
	}
	
	@RequestMapping("edit-item")
	public ModelAndView editItem(@RequestParam("id") String id) {
		return new ModelAndView("edit", "id", id);
	}
	
//	@RequestMapping("item-list")
//	public ModelAndView listOfItems(@RequestParam("id") String id) {
//		return new ModelAndView("update", "id", id);
//	}
	
//	@RequestMapping("update-person")
//	public ModelAndView updatePerson(Person human) {
//		
//		p.save(human);
//		return new ModelAndView("redirect:/");
//	}
	
	@RequestMapping("register-user")
	public ModelAndView addNewPerson(@RequestParam("firstname") String firstName, @RequestParam("lastname") 
	String lastName, @RequestParam("email") String email, @RequestParam("phone") String phone) {
		
		user.save(new Users (firstName, lastName, email, phone));
		return new ModelAndView("redirect:/");
	}
	
	
}
