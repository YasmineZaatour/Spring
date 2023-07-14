package yasmine.mysql.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departement")
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String num;
	private String capacité;
	private String spécialité;


	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCapacité() {
		return capacité;
	}

	public void setCapacité(String capacité) {
		this.capacité = capacité;
	}

	public String getSpécialité() {
		return spécialité;
	}

	public void setSpécialité(String spécialité) {
		this.spécialité = spécialité;
	}


	public Departement(Long id, String num, String capacité, String spécialité, List<User> users) {
		super();
		this.num = num;
		this.capacité = capacité;
		this.spécialité = spécialité;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", num=" + num + ", capacité=" + capacité + ", spécialité=" + spécialité + "]";
	}
	
	


}
