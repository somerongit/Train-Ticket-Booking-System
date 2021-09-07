/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainTicket;

/**
 *
 * @author Somerom
 */
public class Station {

	//private int numberOfStation;
	private double distance;
	protected double price;
	//fro calculating price of ticket
	protected double price(String sourceStaion, String destinationStation){
		distance = stationDistance(sourceStaion,destinationStation);
		price = distance * 0.25;
		
		return price;
	}
	//for calculating distance between two station
	private double stationDistance(String source,String destination){
		
		String[][] dumToBally = new String[5][2];
		//name of station
		dumToBally[0][0] = "Dum Dum";
		dumToBally[1][0] = "Bidhannagar";
		dumToBally[2][0] = "Sealdah";
		dumToBally[3][0] = "Park Circus";
		dumToBally[4][0] = "Ballygunge";
		
		//distance of station
		dumToBally[0][1] = "0";
		dumToBally[1][1] = "10";
		dumToBally[2][1] = "19";
		dumToBally[3][1] = "24";
		dumToBally[4][1] = "28";
		
		String[][] ballyToBudge = new String[9][2];
		//name of station
		ballyToBudge[0][0] = "Budge Budge";
		ballyToBudge[1][0] = "Nangi";
		ballyToBudge[2][0] = "Akra";
		ballyToBudge[3][0] = "Brace Bridge";
		ballyToBudge[4][0] = "Majerhat";
		ballyToBudge[5][0] = "New Alipore";
		ballyToBudge[6][0] = "Tollygunge";
		ballyToBudge[7][0] = "Lake Gardens";
		ballyToBudge[8][0] = "Ballygunge";

		//distance of station
		ballyToBudge[0][1] = "0";
		ballyToBudge[1][1] = "2";
		ballyToBudge[2][1] = "4";
		ballyToBudge[3][1] = "6";
		ballyToBudge[4][1] = "8";
		ballyToBudge[5][1] = "10";
		ballyToBudge[6][1] = "14";
		ballyToBudge[7][1] = "18";
		ballyToBudge[8][1] = "20";
		
		String[][] ballyToCan = new String[16][2];
		//name of station
		ballyToCan[0][0] = "Canning";
		ballyToCan[1][0] = "Taldi";
		ballyToCan[2][0] = "Betberia Ghola Halt";
		ballyToCan[3][0] = "Ghutiari Shariff";
		ballyToCan[4][0] = "Gaurdaha";
		ballyToCan[5][0] = "Piali";
		ballyToCan[6][0] = "Champahati";
		ballyToCan[7][0] = "Kalkapur";
		ballyToCan[8][0] = "Bidhyadharpur";
		ballyToCan[9][0] = "Sonarpur";
		ballyToCan[10][0] = "Narendrapur";
		ballyToCan[11][0] = "Garia";
		ballyToCan[12][0] = "Bagha Jatin";
		ballyToCan[13][0] = "Jadavpur";
		ballyToCan[14][0] = "Dhakuria";
		ballyToCan[15][0] = "Ballygunge";
		
		//distance of station
		ballyToCan[0][1] = "0";
		ballyToCan[1][1] = "3";
		ballyToCan[2][1] = "6";
		ballyToCan[3][1] = "8";
		ballyToCan[4][1] = "11";
		ballyToCan[5][1] = "13";
		ballyToCan[6][1] = "16";
		ballyToCan[7][1] = "18";
		ballyToCan[8][1] = "21";
		ballyToCan[9][1] = "28";
		ballyToCan[10][1] = "30";
		ballyToCan[11][1] = "33";
		ballyToCan[12][1] = "35";
		ballyToCan[13][1] = "38";		
		ballyToCan[14][1] = "40";
		ballyToCan[15][1] = "43";
		
		double range = 0.0000;
		/*listName 1 and 2 for understanding the array name
		listName1 for source and listName2.... destination
		listName = 0 for dumToBally  and 1 for ballyToBudge and 2.... ballyToCan
		*/
		int sourcePosition=-1;
		int destinationPosition=-1;
		int listName1=-1;
		int listName2=-1;

		for(int i = 0; i<16; i++){
			if (i<4){
				if (source.equals(dumToBally[i][0])){
					sourcePosition = i;
					listName1 = 0;
							/*for testing only
				System.out.println(sourcePosition);
				System.out.println(destination);
				end testing*/
				}
				else if (destination.equals(dumToBally[i][0])){
					destinationPosition = i;
					listName2 = 0;
				}/*
				//for testing only
				System.out.println(source);
				System.out.println(destination);
				//end testing*/
			}
			if (i<8){
				if (source.equals(ballyToBudge[i][0])){
					sourcePosition = i;
					listName1 = 1;
				}
				else if (destination.equals(ballyToBudge[i][0]) ){
					destinationPosition = i;
					listName2 = 1;
				}
				
			}
			
				if (source.equals(ballyToCan[i][0])){
					sourcePosition = i;
					listName1 = 2;
				}
				else if (destination.equals( ballyToCan[i][0])){
					destinationPosition = i;
					listName2 = 2;
				}
			/*	
			if(listName1 != -1){
				if(listName2 != -1){
					break;
				}
			}*/
		}//end of for loop
		
/*
		if ((listName1 == -1) || (listName2 == -1)) {
			System.out.println("Please check the station names you enter!\nNo such a station found!");
		}
		else{*/
			//calculating distance
			if (listName1 == listName2){
				if (listName1 == 0){
					range=Integer.parseInt(dumToBally[sourcePosition][1])-Integer.parseInt(dumToBally[destinationPosition][1]);
				}
				else if (listName2 == 1){
					range=Integer.parseInt(ballyToBudge[sourcePosition][1])-Integer.parseInt(ballyToBudge[destinationPosition][1]);
				}
				else if (listName2 == 2){
					range=Integer.parseInt(ballyToCan[sourcePosition][1])-Integer.parseInt(ballyToCan[destinationPosition][1]);
				}				
			}
			else if ((listName1==0) && (listName2==1)){
				range= Integer.parseInt(dumToBally[4][1]) - Integer.parseInt(dumToBally[sourcePosition][1]);
				range = range + (Integer.parseInt(ballyToBudge[8][1])-Integer.parseInt(ballyToBudge[destinationPosition][1]));
			}			
			else if ((listName1==0) && (listName2==2)){
				range= Integer.parseInt(dumToBally[4][1]) - Integer.parseInt(dumToBally[sourcePosition][1]);
				range = range + (Integer.parseInt(ballyToCan[15][1])-Integer.parseInt(ballyToCan[destinationPosition][1]));
			}			
			else if ((listName1==1) && (listName2==0)){				
				range = (Integer.parseInt(ballyToBudge[8][1])-Integer.parseInt(ballyToBudge[sourcePosition][1]));
				range= range + Integer.parseInt(dumToBally[4][1]) - Integer.parseInt(dumToBally[destinationPosition][1]);
			}			
			else if ((listName1==1) && (listName2==2)){
				range = Integer.parseInt(ballyToBudge[8][1])-Integer.parseInt(ballyToBudge[sourcePosition][1]);				
				range = range + (Integer.parseInt(ballyToCan[15][1])-Integer.parseInt(ballyToCan[destinationPosition][1]));
			}			
			else if ((listName1==2) && (listName2==0)){
				range= Integer.parseInt(ballyToCan[15][1])-Integer.parseInt(ballyToCan[sourcePosition][1]);				
				range= range + (Integer.parseInt(dumToBally[4][1]) - Integer.parseInt(dumToBally[destinationPosition][1]));
			}			
			else if ((listName1==2) && (listName2==1)){
				range= Integer.parseInt(ballyToCan[15][1])-Integer.parseInt(ballyToCan[sourcePosition][1]);								
				range = range + (Integer.parseInt(ballyToBudge[8][1])-Integer.parseInt(ballyToBudge[destinationPosition][1]));
			}
			
			if (range<0){
				range = range * -1;
			}
		//}
		
		return range;
	}
}
