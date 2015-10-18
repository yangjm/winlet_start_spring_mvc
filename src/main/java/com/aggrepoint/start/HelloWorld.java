package com.aggrepoint.start;

import org.springframework.ui.Model;

import com.aggrepoint.winlet.spring.annotation.Action;
import com.aggrepoint.winlet.spring.annotation.Window;
import com.aggrepoint.winlet.spring.annotation.Winlet;

/**
 * Template Winlet Class
 * 
 * @author jiangmingyang
 */
@Winlet("helloworld")
public class HelloWorld {
	int i;

	@Window
	public String win(Model model) {
		model.addAttribute("i", i);
		return "page";
	}

	@Action
	public String add() {
		i++;
		return "";
	}
}
