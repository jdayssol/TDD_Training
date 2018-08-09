package payment;

import org.junit.Test;
import org.mockito.Mockito;

import payment.PaymentDetails;
import payment.PaymentService;
import payment.User;

public class PaymentServiceShould {

	PaymentDetails paymentDetails = new PaymentDetails() {};
	PaymentService paymentService = new PaymentService();
	
	@Test(expected=Exception.class)
	public void verify_if_the_user_is_not_valid_throws_a_exception()
	{
		User userInvalidMock = Mockito.mock(User.class);
		Mockito.when(userInvalidMock.isValid()).thenReturn(false);

		PaymentService myPaymentServiceMock = Mockito.spy(paymentService);		
		myPaymentServiceMock.processPayment(userInvalidMock, paymentDetails);
		Mockito.verify(myPaymentServiceMock,Mockito.never()).sentToGateway(userInvalidMock, paymentDetails);
	}
	
	@Test
	public void verify_the_payment_is_sent_to_gateway()
	{
		User userValidMock = Mockito.mock(User.class);
		Mockito.when(userValidMock.isValid()).thenReturn(true);
		
		PaymentService myPaymentServiceMock = Mockito.spy(paymentService);		
		myPaymentServiceMock.processPayment(userValidMock, paymentDetails);
		Mockito.verify(myPaymentServiceMock,Mockito.times(1)).sentToGateway(userValidMock, paymentDetails);
	}
	
}
