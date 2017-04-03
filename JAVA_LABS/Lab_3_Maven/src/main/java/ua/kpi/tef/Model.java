package ua.kpi.tef;

/**
    * Created by Zigzagger on 21.03.2017.
    В классе содержиться логика программы, задание соответствует 3-му варианту
    @see Model
 */
public class Model {
    // The Program logic
    private int arraySize;
    private int[] firstArray = new int[arraySize];
    private int[] secondArray = new int[arraySize];

    public int arraySize(int arraySize){ return arraySize ;}

    public int[] newFirstArray(int[] newArray){ return this.firstArray = newArray;}
    public int[] newSecondArray(int[] newArray){ return this.secondArray = newArray;}

    public int arrayValue(int i, int arrayValue){
        firstArray[i] = arrayValue;
        return firstArray[i];
    }

    public int[] getFirstArray(){ return firstArray;}

    public int[] getSecondArray(){ return secondArray;}

    public  void arrayFormation(){
        for (int i = 0; i < firstArray.length; i++){
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[j] == firstArray[i]) {
                    secondArray[j] = 1;
                    secondArray[i] = 1;
                }
            }
        }
    }
}
