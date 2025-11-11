public class Cube{

    private int side;

    public Cube(){
        this.side=1;
    }

    public Cube (int side){
        setSide(side);
    }

    private void setSide(int side) {
        validateSide(side);
        this.side=side;
    }

    private String validateSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
    }
        int calculateSurfaceArea(){
            return 6* side*side;
    }
        int calculateVolume(){
            return side*side*side;
        }
         String toString(){
            return "Cube:{side= " + side+"}";
        }
    }



