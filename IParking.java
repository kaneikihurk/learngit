package xiangmu;

import java.util.ArrayList;

public interface IParking {
	static ArrayList<Integer> planParking =new ArrayList<>();
	public void print();
	public boolean addCar(int carType);
	public static IParams parse()throws Exception{
		return new IParams() {
			public int getBig() {
				return Integer.parseInt(System.getProperty("big"));
			}
			public int getMedium() {
				return Integer.parseInt(System.getProperty("medium"));
			}
			public int getSmall() {
				return Integer.parseInt(System.getProperty("small"));
			}
			@Override
			public ArrayList<Integer> getPlanParking() {
				// TODO Auto-generated method stub
				return planParking;
			}
		};
	}
}