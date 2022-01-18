package specifications;

import tools.Position;

public interface PilierService{
    public enum MOVE { LEFT, RIGHT, UP, DOWN };

    public void setPosition(Position p);
    public Position getPosition();
}
