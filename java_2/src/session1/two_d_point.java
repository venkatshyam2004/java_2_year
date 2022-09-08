package session1;
import java.lang.Math;
class two_d_point{
    private double x,y;//members
    two_d_point(){
        x=20;
        y=20;
    }
    two_d_point(double x,double y){
        this.setX(x);
        this.setY(y);
    }

private boolean setX(double x){
    if (x>=-100 && x<=100){
this.x=x;
return true;
}
return false;
}
private boolean  setY(double y){
if(y>=-200 && y<=200){
    this.y=y;
    return true;
}
return false;
}
private double caldistance()
{
    return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
}
private double caldistance(two_d_point point){
    return Math.sqrt(Math.pow(point.x-this.x,2)+Math.pow(point.y-this.y,2));
}
private String tostring()
{
    return String.format(null, null, null);
}
}