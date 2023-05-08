TDD Training

Ex1 Stack
	Spécification :
		Implement a Stack class with the following public methods:
			- void push(Object object)
			- Object pop()
		Stack should throw an exception if popped when empty.

	Objective:
	Introduce a naming convention
	Create the production code from the tests
	Start with the assertion
	Tip for getting started: the simplest case

Ex2 Roman numeral converter

	Spécification :
		Implement a Roman numeral converter. 
		The code must be able to take decimals up to 3999.
		The code must convert those decimals
		to their roman equivalent.
		
	Objective:
	Build the algorithm little by little
	Delay exception handling
	Create duplication consciously
	From simple to more complicated structures

Ex3 Leap Year

	Spécification :
	Year All the following rules must be satisfied:
	Is leap year if divisible by 400
	Is NOT leap year if divisible by 100 but not by 400
	Is leap year if divisible by 4
	
	Objective:
	Express business rules clearly
	It is allowed to write a green test if it expresses a business rule

Ex4 Payment Service

	Problem description:  Payment service
	Given a user wants to buy her selected items
	When she submits her payment details
	Then we should process her payment
	Acceptance criteria:
	If the user is not valid, an exception should be thrown.
	Payment should be sent to the payment gateway.
	Create a class with the following signature:
	
	Objective:
	Discover the TDD "outside in"
	"Mock" objects
	"Mock" the behavior of objects
	Check that methods of mocked objects are called.
