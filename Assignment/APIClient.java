package week3.Assignment;

public class APIClient {
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
		System.out.println(endpoint+" is printed from method with single input argument");
	}
	public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		System.out.println(endpoint+" "+requestBody+" "+requestStatus+" are printed from method with 3 input arguments");
	}
	public static void main(String[] args) {
		APIClient ap=new APIClient();
		ap.sendRequest("Sample Endpoint");
		ap.sendRequest("Sample Endpoint1", "Inprogress", true);
	}

}
