package managed;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ejb.UserDAO;
import entities.User;

@RequestScoped
@ManagedBean
public class Index {
	@EJB
	private UserDAO userDAO;

	public List<User> getUsers() {
		
		return userDAO.getAll();
	}
}
