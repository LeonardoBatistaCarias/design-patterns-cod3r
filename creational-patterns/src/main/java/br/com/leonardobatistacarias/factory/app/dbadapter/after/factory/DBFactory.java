package br.com.leonardobatistacarias.factory.app.dbadapter.after.factory;

import br.com.leonardobatistacarias.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
