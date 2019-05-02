public class MainTDA{

	 public static void main(String[] args) {
      punto p1 = new punto();

      p1.setX(66);
      p1.setY(4);
      p1.setZ(8);
      p1.setDimension("3D");

     System.out.println("Dimension:"  + p1.getX());
     System.out.println("Dimension:"  + p1.getY());
     System.out.println("Dimension:"  + p1.getZ());
     System.out.println("Dimension:"  + p1.getDimension());
     System.out.println("Mi jao");
	}
}