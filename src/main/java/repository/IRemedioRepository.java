package repository;

import model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRemedioRepository extends JpaRepository<Remedio, Long> {
}
