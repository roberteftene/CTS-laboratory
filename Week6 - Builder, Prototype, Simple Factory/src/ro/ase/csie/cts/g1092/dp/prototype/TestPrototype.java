package ro.ase.csie.cts.g1092.dp.prototype;

public class TestPrototype {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        ThreeDModel threeDModelOne =
                new ThreeDModel("Green",200);
//        ThreeDModel threeDModelTwo =
//                new ThreeDModel("Red",1500);
//        ThreeDModel threeDModelThree =
//                new ThreeDModel("Red",150);

        //shallow copy
        //another reference pointing to threeDModelOne
        ThreeDModel threeDModelFour = threeDModelOne;
//        ThreeDModel threeDModelFive = threeDModelOne.clone();

        ThreeDModel threeDModelSix = (ThreeDModel) threeDModelOne.clone();
        ThreeDModel threeDModelSev = (ThreeDModel) threeDModelOne.clone();
        ThreeDModel threeDModelEig = (ThreeDModel) threeDModelOne.clone();
        System.out.println("The end");
    }

}
