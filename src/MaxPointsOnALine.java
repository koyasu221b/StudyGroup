import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {


    public static int maxPoints(Point[] points) {

        int length = points.length;
        int ans = 0;

        for(int i = 0; i < length; i++){
            Map<String, Integer> slopeMap = new HashMap();
            Point p1 = points[i];
            int sampoints = 0;
            int maxpoints = 0;
            for(int j = i+ 1 ; j < length ;j++){
                Point p2 = points[j];
                if(p1.x == p2.x && p1.y == p2.y){
                    sampoints++;
                    continue;
                }

                String slope = getSlope(p1, p2);
                if(!slopeMap.containsKey(slope)){
                    slopeMap.put(slope, 1);
                }else{
                    slopeMap.put(slope, slopeMap.get(slope)+1);
                }

                maxpoints = Math.max(maxpoints, slopeMap.get(slope));

            }

            ans = Math.max(ans, maxpoints + sampoints + 1);



        }


        return ans;
    }

    public static String getSlope(Point p1, Point p2){
        if(p1.x == p2.x){
            return p1.x + "/0";

        }else if(p1.y == p2.y){
            return "0/" + p1.y;

        }else{
            int dx = p1.x - p2.x;
            int dy = p1.y - p2.y;
            int d = gcd(dx, dy);
            dy = dy/d;
            dx = dx/d;
            return dy + "/" +  dx;

        }


    }

    public static int gcd(int x, int y){
        if(x == 0){
            return y;
        }

        return gcd(y % x, x);
    }

    public static void main(String[] args) {
        Point[] points = {new Point(1,1), new Point(2,2), new Point(3,3)};
        System.out.println(maxPoints(points)); //3

        Point[] points2 = {new Point(1,1),
                new Point(3,2),
                new Point(5,3),
                new Point(4,1),
                new Point(2,3),
                new Point(1,4),

        };
        System.out.println(maxPoints(points2)); //4

        Point[] points3 = {new Point(0,0)};
        System.out.println(maxPoints(points3)); //1

        Point[] points4 = {new Point(0,0), new Point(0, 0)};
        System.out.println(maxPoints(points4)); //2

        Point[] points5 = {new Point(1,1), new Point(1, 1), new Point(2,3)};
        System.out.println(maxPoints(points5)); //3

    }

}

class Point {
     int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
}

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
