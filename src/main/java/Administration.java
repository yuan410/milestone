
import dao.ProductDao;
//import dao.DaoDatabase;
//import dao.NewInterface;

/**
 *
 * @author alghu437
 */
public class Administration {

	public static void main(String[] args) {
ProductDao dao= new ProductDao();
//NewInterface dao= new DaoDatabase() ;
		gui.MainMenu main = new gui.MainMenu(dao);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
}





