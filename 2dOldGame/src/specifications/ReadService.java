/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: specifications/ReadService.java 2015-03-11 buixuan.
 * ******************************************************/
package specifications;

import tools.Position;
import tools.Sound;

import java.util.ArrayList;

public interface ReadService {
  public Position getHeroesPosition();
  public double getHeroesWidth();
  public double getHeroesHeight();
  public double getPhantomWidth();
  public double getPhantomHeight();
  public double getPilierWidth();
  public double getPilierHeight();
  public double getAsteroidWidth();
  public double getAsteroidHeight();
  public int getRound();
  public int getStepNumber();
  public int getScore();
  public ArrayList<PhantomService> getPhantoms();
  public ArrayList<PhantomService> getPhantoms5PV();
  public ArrayList<PilierService> getPiliers();
  public ArrayList<PilierService> getAsteroid();
  public double getLaserWidth();
  public double getLaserHeight();
  public ArrayList<LaserService> getLasers();

  public Sound.SOUND getSoundEffect();
}
