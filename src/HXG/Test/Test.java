package HXG.Test;

import static org.junit.jupiter.api.Assertions.*;

import HXG.DAO.DAO;
import HXG.DAOImp.DAOImp;
import HXG.enity.User;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		User user = new User("2","866734");
		DAO dao = new DAOImp();
		System.out.println(dao.selectOne(user));
	}

}
