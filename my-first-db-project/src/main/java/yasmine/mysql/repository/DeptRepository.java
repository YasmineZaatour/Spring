package yasmine.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yasmine.mysql.entity.Departement;

public interface DeptRepository extends JpaRepository<Departement,Long>{
	
}
