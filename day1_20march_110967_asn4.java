
public class day1_20march_110967_asn4
	{
		public static void main( String[] args )
			{
				int cars, drivers, passengers, cars_not_driven, cars_driven;
				double space_in_a_car, carpool_capacity, average_passengers_per_car;
				
				//total of 100 cars
				cars = 100;
				
				//each of these cars can fit 4 whole people
				space_in_a_car = 4.0;
				
				//there are 30 drivers present to drive the cars
				drivers = 30;
				
				//there are 90 additional passengers to occupy the cars
				passengers = 90;
				
				//the cars that cannot be filled by a driver will not be drivne
				cars_not_driven = cars - drivers;
				
				//the cars that can be filled by a driver will be driven
				cars_driven = drivers;
				
				//based on the number of drivers, this is exactly how many people
				//can be driven.
				carpool_capacity = cars_driven * space_in_a_car;
				
				//based on how many cars are driven, this is the average amount of 
				//passengers per car
				average_passengers_per_car = passengers / cars_driven;
				
				System.out.println( "There are " + cars + " cars available." );
				System.out.println( "There are only " + drivers + " drivers available." );
				System.out.println( "There will be " + cars_not_driven + " empty cars today." );
				System.out.println( "We can transport " + carpool_capacity + " people today." );
				System.out.println( "We have " + passengers + " to carpool today." );
				System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
			}
	}