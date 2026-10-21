<<<<<<< HEAD
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        display();
    }
   public static void display(){
        Scanner scnr = new Scanner(System.in);
        System.out.printf("*******************\n");
        System.out.printf("What is your value?\n");
        System.out.printf("Binary - 1.\n");
        System.out.printf("Decimal - 2.\n");
        System.out.printf("Hexadecimal - 3.\n");
        System.out.printf("\n");
        int input = scnr.nextInt();
        if(input == 1){
            displayBinary();
        }
        else if(input == 2){
            displayDecimal();
        }
        else if(input == 3){
            displayHexadecimal();
        }
        else{
            System.out.printf("NOT A VALID CHOICE :(.\n");
            display();
        }
   }
   public static void displayDecimal(){
   Scanner scnr = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("Enter your decimal value.\n");    
        System.out.printf("\n");
        System.out.printf("Binary: .\n");
        System.out.printf("Hexadecimal: .\n");
        display();
   }
   
   public static void displayHexadecimal(){
        Scanner scnr = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("Enter your Hexadecimal value.\n");
        String input = scnr.nextLine();
        if(hexaDecimalToDecimal(input).compareTo(BigInteger.valueOf(0)) < 0){
            System.out.printf("NOT A VALUD INPUT :(.\n");
            display();
            return;
        }
       
        System.out.printf("\n");
        System.out.printf("Digits: %d.\n", input.length());
        System.out.printf("Binary: .\n");
        System.out.printf("Decimal: %d.\n", hexaDecimalToDecimal(input));
        display();
   }
   
   public static void displayBinary() {
    System.out.printf("%nEnter your binary value.%n");
    Scanner scnr = new Scanner(System.in);
    String input = scnr.nextLine().trim();

    if (input.isEmpty()) {
        System.out.printf("NOT A VALID INPUT :(.%n");
        return;
    }
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c != '0' && c != '1') {
            System.out.printf("NOT A VALID INPUT :(.%n");
            return;
        }
    }

    BigInteger decimal = new BigInteger(input, 2);   // built-in base-2 parse
    System.out.printf("%nDigits: %d.%n", input.length());
    System.out.printf("Decimal: %s.%n", decimal);
    System.out.printf("Hexadecimal: %s.%n", decimal.toString(16).toUpperCase());
    display();
}
    public static BigInteger hexaDecimalToDecimal(String hexaDecimal){
        int digits = hexaDecimal.length();
        if(digits == 0){
            return BigInteger.valueOf(0);
        }
        for(int i = 0; i < hexaDecimal.length() ; i++){
        int checkDecimal = hexaDecimalDigitToDecimal(hexaDecimal.substring(i,i+1));
        if(checkDecimal < 0){
            return BigInteger.valueOf(-1);
        }
        }

        BigInteger decimal = BigInteger.valueOf(hexaDecimalDigitToDecimal(hexaDecimal.substring(0,1)));
        return decimal.multiply(BigInteger.valueOf(16).pow(digits-1)).add((hexaDecimalToDecimal(hexaDecimal.substring(1))));
    }
 
    public static BigInteger binaryToDecimal(BigInteger binary){
        int digits = findDigitsBinary(binary);
        if(digits==1){
            if(binary.compareTo(BigInteger.valueOf(1)) == 0){
                return BigInteger.valueOf(1);
            }
            else{
                return BigInteger.valueOf(0);
            }
        }
        return BigInteger.valueOf(2).pow(digits - 1).add(binaryToDecimal(binary.subtract(BigInteger.valueOf(10).pow(digits-1))));
    }
   public static String binaryToHexaDecimal(BigInteger binary){
       return "";
   }
    public static int findDigitsBinary(BigInteger input){
        int digits = 1;
        int comparison = 0;
        for(int i = 0 ; i < 1000 ; i++){
            comparison = input.compareTo(BigInteger.valueOf(10).pow(i+1));
            if(comparison >= 0) {
                digits++;
            }
        }
        return digits;
    }
   
    public static int hexaDecimalDigitToDecimal(String hexaDecimal){
        if(hexaDecimal.equals("0")){
            return 0;
        }
        else if(hexaDecimal.equals("1")){
            return 1;
        }
        else if(hexaDecimal.equals("2")){
            return 2;
        }
        else if(hexaDecimal.equals("3")){
            return 3;
        }
        else if(hexaDecimal.equals("4")){
            return 4;
        }
        else if(hexaDecimal.equals("5")){
            return 5;
        }
        else if(hexaDecimal.equals("6")){
            return 6;
        }
        else if(hexaDecimal.equals("7")){
            return 7;
        }
        else if(hexaDecimal.equals("8")){
            return 8;
        }
        else if(hexaDecimal.equals("9")){
            return 9;
        }
        else if(hexaDecimal.equals("A")){
            return 10;
        }
        else if(hexaDecimal.equals("B")){
            return 11;
        }
        else if(hexaDecimal.equals("C")){
            return 12;
        }
        else if(hexaDecimal.equals("D")){
            return 13;
        }
        else if(hexaDecimal.equals("E")){
            return 14;
        }
        else if(hexaDecimal.equals("F")){
            return 15;
        }
        else{
            return -9999999;
        }
       
    }
}
=======
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        display();
    }
   public static void display(){
        Scanner scnr = new Scanner(System.in);
        System.out.printf("*******************\n");
        System.out.printf("What is your value?\n");
        System.out.printf("Binary - 1.\n");
        System.out.printf("Decimal - 2.\n");
        System.out.printf("Hexadecimal - 3.\n");
        System.out.printf("\n");
        int input = scnr.nextInt();
        if(input == 1){
            displayBinary();
        }
        else if(input == 2){
            displayDecimal();
        }
        else if(input == 3){
            displayHexadecimal();
        }
        else{
            System.out.printf("NOT A VALID CHOICE :(.\n");
            display();
        }
   }
   public static void displayDecimal(){
   Scanner scnr = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("Enter your decimal value.\n");    
        System.out.printf("\n");
        System.out.printf("Binary: .\n");
        System.out.printf("Hexadecimal: .\n");
        display();
   }
   
   public static void displayHexadecimal(){
        Scanner scnr = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("Enter your Hexadecimal value.\n");
        String input = scnr.nextLine();
        if(hexaDecimalToDecimal(input).compareTo(BigInteger.valueOf(0)) < 0){
            System.out.printf("NOT A VALUD INPUT :(.\n");
            display();
            return;
        }
       
        System.out.printf("\n");
        System.out.printf("Digits: %d.\n", input.length());
        System.out.printf("Binary: .\n");
        System.out.printf("Decimal: %d.\n", hexaDecimalToDecimal(input));
        display();
   }
   
   public static void displayBinary(){
    Scanner scnr = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("Enter your binary value.\n");
        String input = scnr.nextLine();
        for(int i = 0 ; i < input.length(); i++){
            System.out.printf("DIGIT TO DECIMAL%d", hexaDecimalDigitToDecimal(input.substring(i,i+1)));
        if((hexaDecimalDigitToDecimal(input.substring(i,i+1)) != 0) || (hexaDecimalDigitToDecimal(input.substring(i,i+1)) != 1)){
            System.out.printf("NOT A VALUD INPUT :(.\n");
            display();
            return;
        }
        }
        BigInteger binaryInput = new BigInteger(input, 10);
        System.out.printf("\n");
        System.out.printf("Digits: %s.\n", findDigitsBinary(binaryInput));
        System.out.printf("Decimal: %s.\n", binaryToDecimal(binaryInput));
        System.out.printf("Hexadecimal: .\n");
        display();
   }
    public static BigInteger hexaDecimalToDecimal(String hexaDecimal){
        int digits = hexaDecimal.length();
        if(digits == 0){
            return BigInteger.valueOf(0);
        }
        for(int i = 0; i < hexaDecimal.length() ; i++){
        int checkDecimal = hexaDecimalDigitToDecimal(hexaDecimal.substring(i,i+1));
        if(checkDecimal < 0){
            return BigInteger.valueOf(-1);
        }
        }

        BigInteger decimal = BigInteger.valueOf(hexaDecimalDigitToDecimal(hexaDecimal.substring(0,1)));
        return decimal.multiply(BigInteger.valueOf(16).pow(digits-1)).add((hexaDecimalToDecimal(hexaDecimal.substring(1))));
    }
 
    public static BigInteger binaryToDecimal(BigInteger binary){
        int digits = findDigitsBinary(binary);
        if(digits==1){
            if(binary.compareTo(BigInteger.valueOf(1)) == 0){
                return BigInteger.valueOf(1);
            }
            else{
                return BigInteger.valueOf(0);
            }
        }
        return BigInteger.valueOf(2).pow(digits - 1).add(binaryToDecimal(binary.subtract(BigInteger.valueOf(10).pow(digits-1))));
    }
   public static String binaryToHexaDecimal(BigInteger binary){
       return "";
   }
    public static int findDigitsBinary(BigInteger input){
        int digits = 1;
        int comparison = 0;
        for(int i = 0 ; i < 1000 ; i++){
            comparison = input.compareTo(BigInteger.valueOf(10).pow(i+1));
            if(comparison >= 0) {
                digits++;
            }
        }
        return digits;
    }
   
    public static int hexaDecimalDigitToDecimal(String hexaDecimal){
        if(hexaDecimal.equals("0")){
            return 0;
        }
        else if(hexaDecimal.equals("1")){
            return 1;
        }
        else if(hexaDecimal.equals("2")){
            return 2;
        }
        else if(hexaDecimal.equals("3")){
            return 3;
        }
        else if(hexaDecimal.equals("4")){
            return 4;
        }
        else if(hexaDecimal.equals("5")){
            return 5;
        }
        else if(hexaDecimal.equals("6")){
            return 6;
        }
        else if(hexaDecimal.equals("7")){
            return 7;
        }
        else if(hexaDecimal.equals("8")){
            return 8;
        }
        else if(hexaDecimal.equals("9")){
            return 9;
        }
        else if(hexaDecimal.equals("A")){
            return 10;
        }
        else if(hexaDecimal.equals("B")){
            return 11;
        }
        else if(hexaDecimal.equals("C")){
            return 12;
        }
        else if(hexaDecimal.equals("D")){
            return 13;
        }
        else if(hexaDecimal.equals("E")){
            return 14;
        }
        else if(hexaDecimal.equals("F")){
            return 15;
        }
        else{
            return -9999999;
        }
       
    }
}
>>>>>>> 4f88a173833800d5b4fa8da9f6fcd3a245a2f188
