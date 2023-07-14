package yasmine.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yasmine.mysql.entity.Departement;
import yasmine.mysql.repository.DeptRepository;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptRepository deptRepository;


	@GetMapping("/all")
	public List<Departement> getAll() {
		return this.deptRepository.findAll();
	}
	
	@PostMapping ("/add")
	public Departement addUser (@RequestBody Departement departement ) {
		return this.deptRepository.save(departement);

	}
	
}
