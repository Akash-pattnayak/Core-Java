
/**
 * 
  * $                           -----DATA TYPE------
 * %   java defines eight premitive types of data:byte,short,int,long,char,float,double and boolean.

 * %   These eight data types come uder four category.Those are follows:
 * %   1.Integers:This group includes byte,short,int and long,which are for whole-valued signed numbers.
 * %   2.Floating-point numbers: This group includes float and double,which represent numbers with fractional
 * %     precision.
 * %   3.Characters:This group includes char,which represent symbols in character set,likeletters and numbers.
 * %   4. Bollean:This group includes bollean,which is a special type for represeting true/false values.
 * 
 */
 /**
  * DataType
  */
 public class DataType {
 
     public static void main(String[] args) {
         int myIntMinimumValue = Integer.MIN_VALUE;
         System.out.println("Int Min Value="+myIntMinimumValue);
         int myIntMaximumValue = Integer.MAX_VALUE;
         System.out.println("Int Max Value="+myIntMaximumValue);
         int BustedValue = 2147483647+1;
         System.out.println("Busted Maximum Value= "+BustedValue);
         int Busted_Value = -2147483648-1;
         System.out.println("Busted Minimum Value= "+Busted_Value);
         long myLongMinValue = Long.MIN_VALUE;
         System.out.println("Long Min Value= "+myLongMinValue);
         long myLongMaxValue = Long.MAX_VALUE;
         System.out.println("Long Max Value= "+myLongMaxValue);
         byte  myByteMinValue = Byte.MIN_VALUE;
         System.out.println("Byte Min Value="+myByteMinValue);
         byte  myByteMaxValue = Byte.MAX_VALUE;
         System.out.println("Byte Max Value="+myByteMaxValue);
         short myShortMinValue = Short.MIN_VALUE;
         System.out.println("Short Min Value="+myShortMinValue);
         short myShortMaxValue = Short.MAX_VALUE;
         System.out.println("Short Max Value="+myShortMaxValue);
         float myFloatMinValue = Float.MIN_VALUE;
         System.out.println("Float Min Value="+myFloatMinValue);
         float myFloatMaxValue = Float.MAX_VALUE;
         System.out.println("Float Max Value="+myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
         System.out.println("Double Min Value="+myDoubleMinValue);
         double myDoubleMaxValue = Double.MAX_VALUE;
         System.out.println("Double Max Value="+myDoubleMaxValue);
     }
 }