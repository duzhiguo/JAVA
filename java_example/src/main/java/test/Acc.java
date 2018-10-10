package test;

public class Acc {
    private  String name ,school;
    public  Acc(String name ,String school){
        this.name = name;
        this.school = school;
    }
public  String toSting(){

        return school+"学校"+name;
    }

}
