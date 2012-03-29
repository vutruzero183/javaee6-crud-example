package managed;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UserDAO;
import entities.User;

@ViewScoped
@ManagedBean
public class UserDelete {
	private User user;
	private int userId;
	
	@EJB
	private UserDAO userDAO;
	
	public String delete() {
		userDAO.delete(user);
		return "index";
	}

	
	public int getUserId() {
		return userId;
	}
	
	public String cancel() {
		return "index";
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
