package br.com.leonardobatistacarias.bridge.backend.services;

import br.com.leonardobatistacarias.bridge.backend.dao.UserDao;
import br.com.leonardobatistacarias.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
