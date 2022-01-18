/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/ViewerService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.stage.Popup;

public interface ViewerService{
  public void init();
  public Parent getPanel(Stage stage);
  public boolean getPause();
  public void setPause(boolean b );
  public Popup getPopUpOver();
  public Popup getPopUpWin();
  public void setMainWindowWidth(double w);
  public void setMainWindowHeight(double h);
}
