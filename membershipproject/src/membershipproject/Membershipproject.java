package membershipproject;

public class Membershipproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]memberData = new String[5]; // Assuming 5 fields:name,email,phone,address,membershipType
		//Replace these with actual input methods
		memberData[0]="Dickens Amon";
		memberData[1]="dickensamon@example.com";
		memberData[2]="123-456-789";
		memberData[3]="123 Main";
		memberData[4]="Standard";
		//Process the collected data
		System.out.println("Membership details:");
		for(int i=0; 1<memberData.length; i++) {
			System.out.println("Field"+(i+1)+":"+memberData[i]);
		}
		

	}

}
