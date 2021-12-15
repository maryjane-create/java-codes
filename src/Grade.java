import java.util.function.Supplier;

public class Grade {
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }


    public boolean tvIsOn(int num) {

            if (num%2 == 0){
        return  true;}


        return false;
    }



  public boolean isTvOn(String current){
        if ( current =="On"){
            return true;
        }
        return false;
  }

  public  String changeChannel(int channelNumber, String current) {
      String channel1 = "tvc";
      String channel2 = "superscreen";
      String channel3 = "rhema tv";

      String channelName = null;
      if (isTvOn("On")==true) {
          for (channelNumber = 1; channelNumber <= 3; channelNumber++) {
              switch (channelNumber) {
                  case 1:
                      channelName = channel1;
                      break;
                  case 2:
                      channelName = channel2;
                      break;
                  case 3:
                      channelName = channel3;
                      break;
              }

          }
          return channelName;
      }
else
      return null;
  }



}
