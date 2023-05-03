import com.company.model.Catalogo;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogoAlmacen1 = new Catalogo();

        catalogoAlmacen1.agregarRobotAlCatalogo("Codigo1", 20);

        catalogoAlmacen1.agregarComponenteARobot(
                "Codigo1",
                1 ,
                "Pistón",
                15);

        try {
            catalogoAlmacen1.agregarRobotAlCatalogo("Codigo1", 20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            catalogoAlmacen1.agregarComponenteARobot(
                    "CodigoInvalido",
                    1,
                    "Pistón",
                    15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

        try {
            catalogoAlmacen1.agregarComponenteARobot(
                    "Codigo1",
                    1,
                    "Pistón",
                    15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

       catalogoAlmacen1.agregarComponenteARobot(
                "Codigo1",
                2,
                "Rueda",
                5);

        catalogoAlmacen1.agregarRobotAlCatalogo("Codigo2", 20);
        catalogoAlmacen1.agregarComponenteARobot(
                "Codigo2",
                2,
                "Rueda",
                5);
        catalogoAlmacen1.agregarComponenteARobot(
                "Codigo2",
                2,
                "Rueda",
                5);
        System.out.println(catalogoAlmacen1.nombreDeComponentesUsados());

    }
}