//Method for when the convert button is pressed
//convertButton.setOnAction(new EventHandler<ActionEvent>()) {
	//@Override public void handle(ActionEvent e) {
public class GUICalc {
public void lengthConversion(ActionEvent e) {

double lengthValue1 = Double.valueOf(lengthAmount1.getText());
double lengthValue2 = 0;
		
		// Inches
  		final double INCHES_TO_CENTI = 2.54; // MULTIPLY
  		final double INCHES_TO_METERS = 39.37; // DIVIDE
  		final double INCHES_TO_KILOMETERS = 39370.079; // DIVIDE
  		final double INCHES_TO_FEET = 12; // DIVIDE
  		final double INCHES_TO_MILE = 63360; // DIVIDE

  		// Feet
		final double FEET_TO_CENTI = 30.48; // MULTIPLY
  		final double FEET_TO_METERS = 3.281; // DIVIDE
  		final double FEET_TO_KILOMETERS = 3280.84; // DIVIDE
        final double FEET_TO_INCHES = 12; // MULTIPLY
        final double FEET_TO_MILE = 5280; // DIVIDE

  		// Mile
	    final double MILE_TO_CENTI = 160934.4; // MULTIPLY
  		final double MILE_TO_METERS = 1609.34; // MULTIPLY
  		final double MILE_TO_KILOMETERS = 1.60934; // MULTIPLY
        final double MILE_TO_INCHES = 63360; // MULTIPLY
        final double MILE_TO_FEET = 5280; // MULTIPLY

		// Centimeters
		final double CENTI_TO_INCHES = 2.54; // DIVIDE
  		final double CENTI_TO_FEET = 30.48; // DIVIDE
  		final double CENTI_TO_MILES = 160934.4; // DIVIDE
        final double CENTI_TO_METERS = 100; // DIVIDE
        final double CENTI_TO_KIL0METERS = 100000; // DIVIDE

  		// Meters
  		final double METERS_TO_INCHES = 39.37; // MULTIPLY
  		final double METERS_TO_FEET = 3.281; // MULTIPLY
  		final double METERS_TO_MILES = 1609.344; // DIVIDE
        final double METERS_TO_CENTI = 100; // MULTIPLY
        final double METERS_TO_KILOMETERS =  1000; // DIVIDE

  		// Kilometers
  		final double KILO_TO_INCHES = 39370.079; // MULTIPLY
  		final double KILO_TO_FEET = 3280.84; // MULTIPLY
  		final double KILO_TO_MILES = 1.609; // DIVIDE
        final double KILO_TO_CENTI = 100000; // MULTIPLY
        final double KILO_TO_METERS = 1000; // MULTIPLY


    /*******************************
    Calculations if INCH is Selected
    ********************************/

    	//INCHES AND FEET
        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Feet") {
          
            lengthValue2 = lengthValue1 / INCHES_TO_FEET ;
        }
        
        //INCHES TO MILES
        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Miles") {
            
            lengthValue2 = lengthValue1 / INCHES_TO_MILE;
        }
        
        //INCHES TO CENTIMETERS
        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Centimeters") {
            
            lengthValue2 = lengthValue1 * INCHES_TO_CENTI;
        }
        
        //INCHES TO METERS
        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Meters") {
            
            lengthValue2 = lengthValue1 / INCHES_TO_METERS;
        }
        
        //INCHES TO KILOMETERS
        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Kilometers") {
            lengthValue2 = lengthValue1 / INCHES_TO_KILOMETERS;
        }

    /********************************
    Calculations if FEET is Selected
    ********************************/

        //FEET TO INCHES
        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Inches") {
            lengthValue2 = lengthValue1 * FEET_TO_INCHES;
        }
        
        //FEET TO MILES
        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Miles") {
            lengthValue2 = lengthValue1 / FEET_TO_MILE;
        }
        
        //FEET TO CENTIMETERS
        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Centimeters") {
            lengthValue2 = lengthValue1 * FEET_TO_CENTI;
        }

        //FEET TO METERS
        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Meters") {
            lengthValue2 = lengthValue1 / FEET_TO_METERS;
        }

        //FEET TO KILOMETERS
        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Kilometers") {
            lengthValue2 = lengthValue1 / FEET_TO_KILOMETERS;
        }
        
    /*******************************
    Calculations if MILE is Selected
    ********************************/

        //MILES TO INCHES
        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Inches") {
            lengthValue2 = lengthValue1 * MILE_TO_INCHES
        }
        
        //MILES TO FEET
        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Feet") {
            lengthValue2 = lengthValue1 * MILE_TO_FEET;
        }
        
        //MILES TO CENTIMETERS
        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Centimeters" ) {
            lengthValue2 = lengthValue1 * MILE_TO_CENTI;
        }
        
        //MILES TO METERS
        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Meters") {
            lengthValue2 = lengthValue1 * MILE_TO_METERS;
        }

        //MILES TO KILOMETERS
        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Kilometers") {
            lengthValue2 = lengthValue1 * MILE_TO_KILOMETERS;
        }

    /********************************
    Calculations if CENTI is Selected
    *********************************/

        //CENTIMETERS TO INCHES
        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Inches") {
            lengthValue2 = lengthValue1 / CENTI_TO_INCHES;
        }

        //CENTIMETERS TO FEET
        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Feet") {
            lengthValue2 = lengthValue1 / CENTI_TO_FEET;
        }
        
        //CENTIMETERS TO MILES
        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Miles") {
            lengthValue2 = lengthValue1 / CENTI_TO_MILES;
        }
        
        //CENTIMETERS TO METERS
        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Meters") {
            lengthValue2 = lengthValue1 / CENTI_TO_METERS;
        }
       
       	//CENTIMETERS TO KILOMETERS
        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Kilometers") {
            lengthValue2 = lengthValue1 / CENTI_TO_KIL0METERS;
        }
        
    /********************************
    Calculations if METER is Selected
    ********************************/
       
        //METERS TO INCHES
        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Inches") {
            lengthValue2 = lengthValue1 * METERS_TO_INCHES;
        }
        
        //METERS TO FEET
        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Feet") {
            lengthValue2 = lengthValue1 * METERS_TO_FEET;
        }

        //METERS TO MILES
        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Miles") {
            lengthValue2 = lengthValue1 / METERS_TO_MILES;
        }
        
        //METERS TO CENTIMETERS
        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Centimeters") {
            lengthValue2 = lengthValue1 * METERS_TO_CENTI;
        }
        
        //METERS TO KILOMETERS
        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Kilometers") {
            lengthValue2 = lengthValue1 / METERS_TO_KILOMETERS;
        }
        
    /*******************************
    Calculations if KILO is Selected
    ********************************/

        //KILOMETERS TO INCHES
        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Inches") {
            lengthValue2 = lengthValue1 * KILO_TO_INCHES;
        }
       
        //KILOMETERS TO FEET
        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Feet") {
            lengthValue2 = lengthValue1 * KILO_TO_FEET;
        }
        
        //KILOMETERS TO MILES
        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Miles") {
            lengthValue2 = lengthValue1 / KILO_TO_MILES;
        }
        
        //KILOMETERS TO CENTIMETERS
        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Centimeters") {
            lengthValue2 = lengthValue1 * KILO_TO_CENTI;
        }
        
        //KILOMETERS TO METERS
        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Meters") {
            lengthValue2 = lengthValue1 * KILO_TO_METERS;
        }
        
    //Displaying lengthValue2 into the convertedLength text feild
    convertedLength.setText(String.valueOf(lengthValue2));
    	
    	//For when the clear button is pressed
    	if (e.getSource == clearButton) {
    		lengthAmount1.setText("000");
    		convertedLength.setText("000");
    	}
    }
}
