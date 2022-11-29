class MyPoint{
  int x;
  int y;
}

class Circle extends MyPoint {
  int r;
} // 상속

class Circle{ // 포함
  MyPoint p = new MyPoint();
  int r;
}

public class InheritanceTest {
  public static void main(String[] args){
    Circle c = new Circle();
    c.x = 1; // 포함일 경우 c.p.x = 1;
    c.y = 2; // c.p.y = 2;
    c.p = 3;
    System.out.println("c.x="+c.x);
    System.out.println("c.y="+c.y);
    System.out.println("c.r="+c.r);
  }
}
