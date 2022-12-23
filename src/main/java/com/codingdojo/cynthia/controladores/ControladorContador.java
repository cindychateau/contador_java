package com.codingdojo.cynthia.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorContador {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		
		Object contador_objeto = session.getAttribute("contador");
		if(contador_objeto == null) {
			session.setAttribute("contador", 1);
		} else {
			Integer contador = (Integer)contador_objeto;
			contador++;
			session.setAttribute("contador", contador);
		}
		
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		
		Object contador_objeto = session.getAttribute("contador");
		if(contador_objeto == null) {
			session.setAttribute("contador", 0);
		}
		
		return "counter.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
	
}
