class MotoCycle {
    private

    static boolean turnOn;
    static int gearButton;
    private int currentSpeed;

    public static boolean isBikeIsOn() {
        turnOn = true;
        return true;
    }

    public static boolean isBikeOff() {
        turnOn = false;
        return false;
    }

    public int acceleration (int increaseGear) {
        if( currentSpeed <= 20){
            return currentSpeed +1;

        } else if(gearButton <= 31){
            return currentSpeed +=2;

        } else if (gearButton<= 40) {
            return currentSpeed +=3;

        } else {
            return currentSpeed +=4;
    }

    }
    public int decelerate(int checkGear) {
        if( gearButton <= 20){
            return currentSpeed -=1;

        } else if(gearButton <= 31){
            return currentSpeed -2;

        } else if (gearButton<= 40) {
            return currentSpeed -3;

        } else {
            return currentSpeed -4;
        }
    }

//    public int gearFour(int currentSpeed) {
//        for (int index = 41; index < 50; index++) {
//            currentSpeed = index + 4;
//        }
//        return currentSpeed;
//    }
//
//    public int decreaseGearOne(int currentSpeed) {
//        for (int index = 0; index < 20; index--) {
//            currentSpeed = index - 1;
//        }
//        return currentSpeed;
//    }
//
//    public int decrementByTwo(int currentSpeed) {
//        for (int index = 21; index < 30; index--) {
//            currentSpeed = index - 2;
//        }
//        return currentSpeed;
//    }
//
//    public int decrementGearByThree(int currentSpeed) {
//        for (int index = 31; index < 40; index--) {
//            currentSpeed = index - 3;
//        }
//        return currentSpeed;
//    }
//
//    public int decrementGearByFour(int currentSpeed) {
//        for (int index = 41; index < 50; index--) {
//            currentSpeed = currentSpeed -4;
//
//        }
//        return currentSpeed;
//    }
}
