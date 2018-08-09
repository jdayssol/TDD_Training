package payment;

public class PaymentService {
	
	public void processPayment(User user, PaymentDetails paymentDetails) 
	{  
		if(user.isValid())
		{
			sentToGateway(user,paymentDetails);
		}else{
			throw new PaymentException();	
		}	   
	}
	
	protected void sentToGateway(User user, PaymentDetails paymentDetails)
	{
		System.out.println("The payment is sent to gateway");
		
	}
}
