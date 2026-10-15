public class Main {

    public static void main(String[] args) {
        System.out.println("=== TEST INTERAZIONE FORME GEOMETRICHE ===");

        // 1. Creiamo un Cerchio di raggio 3 centrato in (4, 5)
        Cerchio primoCerchio = new Cerchio(3.0, 4.0, 5.0);
        System.out.println("Area Cerchio: " + primoCerchio.area());
        System.out.println("Perimetro Cerchio: " + primoCerchio.perimetro());

        System.out.println("\n--- Quadrato Circoscritto al Cerchio ---");
        Quadrato qCircoscritto = primoCerchio.getQuadratoCircoscritto();
        System.out.println("Lato: " + qCircoscritto.getLato());
        System.out.println("Area: " + qCircoscritto.area());
        System.out.println("Centro: (" + qCircoscritto.getX() + ", " + qCircoscritto.getY() + ")");

        System.out.println("\n--- Quadrato Iscritto nel Cerchio ---");
        Quadrato qIscritto = primoCerchio.getQuadratoIscritto();
        System.out.println("Lato: " + qIscritto.getLato());
        System.out.println("Area: " + qIscritto.area());

        System.out.println("\n-------------------------------------------");

        // 2. Creiamo un Quadrato di lato 4 centrato in (0, 0)
        Quadrato primoQuadrato = new Quadrato(4.0, 0.0, 0.0);
        
        System.out.println("\n--- Cerchio Circoscritto al Quadrato ---");
        Cerchio cCircoscritto = primoQuadrato.getCerchioCircoscritto();
        System.out.println("Raggio: " + cCircoscritto.getRaggio());
        System.out.println("Area: " + cCircoscritto.area());

        System.out.println("\n--- Cerchio Iscritto nel Quadrato ---");
        Cerchio cIscritto = primoQuadrato.getCerchioIscritto();
        System.out.println("Raggio: " + cIscritto.getRaggio());
        System.out.println("Area: " + cIscritto.area());
    }
}
