package br.com.leonardobatistacarias.bridge.backend.dao;

import br.com.leonardobatistacarias.bridge.backend.model.User;

public class UserOracleDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
