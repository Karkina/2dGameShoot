package specifications;

import tools.Position;

public interface LaserService{
    public enum MOVE { LEFT, RIGHT, UP, DOWN };

    public Position getPosition();
    public MOVE getAction();
    public void setPosition(Position p);
}
