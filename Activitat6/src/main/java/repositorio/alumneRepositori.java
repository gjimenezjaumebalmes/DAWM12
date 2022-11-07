package repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.balmes.raulr.demo.entity.Alumne;

public interface alumneRepositori extends JpaRepository<Alumne, Long >{
	
}
