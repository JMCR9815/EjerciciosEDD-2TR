package mastermind.dominio;

public enum ColorCombinacion {
    verde, azul, rojo, amarillo, naranja, rosa;

    public static boolean isValid(ColorCombinacion color) {
        if (color.equals(ColorCombinacion.valueOf(color.toString()))) {
            return true;
        }

        return false;
    }

}
