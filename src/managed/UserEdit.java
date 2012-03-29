package managed;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UserDAO;
import entities.User;

@ViewScoped
@ManagedBean
public class UserEdit {
	private User user;

	@EJB
	private UserDAO userDAO;
	

	public String saveUser() {
		if (user.getId() != null)
			userDAO.update(user);
		else
			userDAO.save(user);
		
		return "index.xhtml?faces-redirect=true";
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		if (user == null) {
			user = new User();
		}

		return user;
	}


}
