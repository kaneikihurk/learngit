package xiangmu;

import java.util.ArrayList;

public class ParkingSystem implements IParking{
	private Integer big,medium,small;
	ParkingSystem(Integer big,Integer medium,Integer small){
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	public boolean addCar(int carType){
		if(carType==1) {
			if(big>0) {
				big--;
				return true;
			}
			return false;
		}
		else if(carType==2) {
			if(medium>0) {
				medium--;
				return true;
			}
			return false;
		}
		else if(carType==3){
			if(small>0) {
				small--;
				return true;
			}
		}
		return false;
	}
	public void print(){
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		for(int i=0;i<args.length;i++) {
			IParking.planParking.add(Integer.parseInt(args[i]));
		}
		IParams iparams=IParking.parse();
		ParkingSystem parkingSystem=new ParkingSystem(iparams.getBig(),iparams.getMedium(),iparams.getSmall());
		System.out.println(parkingSystem.addCar(1));
		System.out.println(parkingSystem.addCar(2));
		System.out.println(parkingSystem.addCar(3));
		System.out.println(parkingSystem.addCar(1));
		parkingSystem.print();
	}

}