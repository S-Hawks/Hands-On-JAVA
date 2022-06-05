public class Point {
    private int x;
    private int y;
    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double distance(int x, int y){
         return Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y- getY()), 2));
    }
    public double distance(Point other){  //Mainly known as reference.Though Java is pass by value.
        return distance(other.x, other.y);//More deeply java has reference by value.
    }
}
