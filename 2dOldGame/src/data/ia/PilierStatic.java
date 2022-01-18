package data.ia;

import tools.Position;

import specifications.PilierService;

public class PilierStatic implements PilierService {
    private Position position;

    public PilierStatic(Position p){
        this.position = p;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public Position getPosition() {
        return this.position;
    }
}
