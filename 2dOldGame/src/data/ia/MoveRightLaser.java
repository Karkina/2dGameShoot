package data.ia;

import tools.Position;

import specifications.LaserService;

public class MoveRightLaser implements LaserService{
    private Position position;

    public MoveRightLaser(Position p){ position=p; }

    @Override
    public Position getPosition() { return position; }

    @Override
    public LaserService.MOVE getAction() { return LaserService.MOVE.RIGHT; }

    @Override
    public void setPosition(Position p) { position=p; }
}
