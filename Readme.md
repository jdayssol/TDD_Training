TDD Training

Ex1 Stack
	Spécification :
		Implement a Stack class with the following public methods:
			- void push(Object object)
			- Object pop()
		Stack should throw an exception if popped when empty.

	Objectif :
	Introduire une convention de nommage
	Créer le code de production à partir des tests
	Commencer par l’assertion
	Conseil pour démarrer : le cas le plus simple

Ex2 Roman numeral converter

	Spécification :
		Implement a Roman numeral converter. 
		The code must be able to take decimals up to 3999.
		The code must convert those decimals
		to their roman equivalent.
		
	Objectif :
	Construire l’algorithme petit à petit
	Retarder les traitements d’exception
	Créer de la duplication consciemment
	De structures simples à des structures plus compliquées

Ex3 Leap Year

	Spécification :
	Year All the following rules must be satisfied:
	Is leap year if divisible by 400
	Is NOT leap year if divisible by 100 but not by 400
	Is leap year if divisible by 4
	
	Objectif :
	Exprimer clairement les règles business
	On a le droit d’écrire un test vert si il exprime une règle métier

Ex4 Payment Service

	Problem description:  Payment service
	Given a user wants to buy her selected items
	When she submits her payment details
	Then we should process her payment
	Acceptance criteria:
	If the user is not valid, an exception should be thrown.
	Payment should be sent to the payment gateway.
	Create a class with the following signature:
	
	Objectif :
	Découvrir le TDD « outside in »
	« Mocker » des objets
	« Mocker » le comportement d’objets
	Vérifier que des méthodes d’objets « mockés » sont appelées.
