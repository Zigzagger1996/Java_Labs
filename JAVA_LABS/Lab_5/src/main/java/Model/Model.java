package Model;

import javax.rmi.CORBA.StubDelegate;

/**
 * Created by Zigzagger on 24.04.2017.
 */
public class Model implements Cloneable{
    private int x;
    private int y;

    public Model(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object object){
        if(this == object)
            return true;
        if(object == null)
            return false;
        if(object instanceof Model){
            Model temp = (Model) object;
            return this.x == temp.x && this.y == temp.y;
        }else
            return false;
    }

    public int hashCode(){
        return (x * 66 + y);
    }

    public String toString(){
        return getClass().getName() + "X:" + x + "Y:" + y;
    }

    public Object clone() {//переопределение метода
        try {
            return super.clone();//вызов базового метода
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("невозможно!");
        }
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
