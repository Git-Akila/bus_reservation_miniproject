package mini_project;

public class Bus {
    //  creating private access modifier for security issue.
    private int busNo;
   private boolean ac;
   private int capacity;//get and set method
    //constructor -parameterized constructor
    //this. keyword refers to the current object in a method or constructor.
    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getCapacity(){ //accessor method
        return capacity;
    }
    public int getBusNo(){
        return busNo;

    }

    public void setCapacity(int cap){//mutator
        capacity=cap;
    }
    public void setAc(boolean val){
        ac=val;
    }
    public boolean isAc(){
        return ac;
    }
    public void displayBusInfo(){
        System.out.println("Bus No:"+ busNo + "\tAc:" + ac + "\tTotal Capacity: " + capacity);
    }

}
