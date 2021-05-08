public class Box {
     int length; // default value of int = 0
     int width;
     int height;

     public int getVolume(){
         return this.height * this.width * this.length;
     }


    public Box(int length, int width, int height){
          this.width = width;
          this.height = height;
          this.length = length;
    }


}
