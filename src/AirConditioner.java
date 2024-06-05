public class AirConditioner {

boolean isTurnOn;
int  temperature = 16;

    public  boolean isAirConditionerOn() {
        return isTurnOn;
    }
    public void onAirConditioner(){
        isTurnOn =  true;
    }
    public void offAirConditioner(){
        isTurnOn = false;
    }
    public int decreasedAirConditioner() {
        if(isTurnOn == false){
            temperature -= 1;
       }
        return temperature--;
    }
    public int increasedAirConditioner() {
        if(isTurnOn == true){
            temperature += 1;
        }
        return temperature++;
    }
    public  int  setTemperature() {
        if(temperature > 16 && temperature < 30){
            return temperature+1;
        }
        else{

        }
        return temperature-1;
    }

    public int  checkTemPerature() {
       if(temperature > 30 || temperature  < 16){

       }
        return temperature+1;
    }
}



