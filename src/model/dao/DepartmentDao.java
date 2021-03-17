package model.dao;

import java.util.List;
import model.entities.Department;

public interface DepartmentDao {
	// Methods da Class Department
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}