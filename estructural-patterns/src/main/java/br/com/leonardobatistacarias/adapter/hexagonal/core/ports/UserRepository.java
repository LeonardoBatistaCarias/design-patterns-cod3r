package br.com.leonardobatistacarias.adapter.hexagonal.core.ports;

import java.util.List;

import br.com.leonardobatistacarias.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
