public class punto{
	
	private int  x,y,z;
    String dimension = "3D";

    public punto(int coordenadaX, int coordenadaY){
       this.x=coordenadaX;
       this.y=coordenadaY;
    }

    public punto(int coordenadaX, int coordenadaY, int coordenadaZ){
       this.x=coordenadaX;
       this.y=coordenadaY;
       this.z=coordenadaZ;
    }

    public punto(){
    	x=0;
    	y=0;
    }

    public int getX(){
    	return x;
    }


    public int getY(){
    	return y;
    }


    public int getZ(){
    	return z;
    }


    public String getDimension(){
    	return dimension;
    }

    void setX(int x){
     this.x=x;
    }

    void setY(int y){
     this.y=y;
    }


    void setZ(int z){
     this.z=z;
    }


    void setDimension(String dimension){
     this.dimension=dimension;
    }
}