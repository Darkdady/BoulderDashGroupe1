package model.tile;

public class Mud extends Tile{

	public Mud(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean getIsSolid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean getIsBreakable() {
		// TODO Auto-generated method stub
		return true;
	}
}
