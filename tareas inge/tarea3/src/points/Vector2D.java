package points;

public class Vector2D {
    private Integer x;
    private Integer y;

    public Vector2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    //resta
    public Vector2D subtract(Vector2D other) {
        if (other == null) {
            throw new IllegalArgumentException("El vector a restar no puede ser nulo.");
        }
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

 //multiplicar
    public Vector2D multiply(Integer scalar) {
        if (scalar == null) {
            throw new IllegalArgumentException("El escalar no puede ser nulo.");
        }
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    public void print() {
        System.out.println("x = " + this.x + " y = " + this.y);
    }
}


