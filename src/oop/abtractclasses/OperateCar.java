package oop.abtractclasses;

public interface OperateCar {
	
	public enum Direction {
	     Right, Left
	}
   
	int turn(Direction direction,
            double radius,
            double startSpeed,
            double endSpeed);
	int changeLanes(Direction direction,
                   double startSpeed,
                   double endSpeed);
	int signalTurn(Direction direction, boolean signalOn);
	int getRadarFront(double distanceToCar, double speedOfCar);
	int getRadarRear(double distanceToCar, double speedOfCar);
	//fun added1
	
}
