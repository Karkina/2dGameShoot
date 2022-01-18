/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/WriteService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.Position;
import tools.Sound;

import java.util.ArrayList;

public interface WriteService {
  public void setHeroesPosition(Position p);

  public void setStepNumber(int n);

  public void addPhantom(Position p);

  public void addPhantom5PV(Position p);

  public void addPilier(Position p);
  public void addAsteroid(Position p);

  public void removePhantom(PhantomService p);

  public void setPhantoms(ArrayList<PhantomService> phantoms);

  public void setPhantoms5PV(ArrayList<PhantomService> phantoms);

  public void setSoundEffect(Sound.SOUND s);

  public void setScore(int scoreAmount);

  public void addScore(int score);

  public void removeScore(int score);

  public void setRound(int score);

  public void clearPhantoms();

  public void clearPhantoms5PV();

  public void addLaser(Position p);
  public void setLasers(ArrayList<LaserService> lasers);
  public void removeLaser(LaserService laserSingle);
}

