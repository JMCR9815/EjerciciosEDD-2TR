package mastermind.dominio;

public class Combinacion {
    private ColorCombinacion[] combinacion;
    private Combinacion enigma[] = new Combinacion[4];


    public Combinacion(int size) {
        combinacion = new ColorCombinacion[size];
    }

    public void setCOlorCombinacion(int i, ColorCombinacion color) {

    }

    public int size() {
        return enigma.length;
    }


    public ColorCombinacion getAt(int colorPos) {
        ColorCombinacion color = null;
        for (int j = 0; j < combinacion.length; j++) {
            if (combinacion[j].equals(ColorCombinacion.values()[colorPos])) {
                color = ColorCombinacion.values()[colorPos];
            }
        }
        return color;
    }
}
