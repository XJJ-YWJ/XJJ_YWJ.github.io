package HXG.DAO;

import HXG.enity.User;

public interface DAO {
	public boolean selectOne(User user);
	public int addUser(User user);
}
