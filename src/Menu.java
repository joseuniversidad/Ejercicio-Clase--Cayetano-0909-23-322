import java.util.Scanner;
public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. DispositivoElectronico");
            System.out.println("2. Computadora");
            System.out.println("3. Dispositivo Movil");
            System.out.println("4. Electrodomestico");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    DispositivoElectronico dispositivoElectronico = new DispositivoElectronico("PlayStation ", 2025) {
                        @Override
                        public void mostrar() {
                            System.out.println("Nombre: " + getNombreDispositivo() + "Año de Dispositivo: " + getAñoDeDispositivo());
                        }
                    };
                    dispositivoElectronico.mostrar();
                    break;
                case 2:
                    int opcion2;
                        Computadora computadora = new Computadora("Victus HP ", "Gamer ", 2022, "Corei5 ");
                        computadora.mostrar();
                        do{
                        System.out.println("¿ Que tipo de Computadora le gustaria ver ?");
                        System.out.println("1. Laptop");
                        System.out.println("2. Desktop");
                        System.out.println("3. Regresar al Menu Principal");
                        opcion2 = scanner.nextInt();
                        switch (opcion2) {
                            case 1:
                                Laptop laptop = new Laptop("Solido 516GB ", "GEFORCE GTC ");
                                laptop.mostrar();
                                break;
                            case 2:
                                Desktop desktop = new Desktop("Solido 516GB ", "LED 8k ");
                                desktop.mostrar();
                                break;
                            case 3:
                                System.out.println("Volviendo al menu principal.........");
                                break;
                        }
                    } while (opcion2 != 3);
                    break;

                case 3:
                    int opcion3;
                    DispositivoMovil dispositivoMovil = new DispositivoMovil("Iphone ", 2025, "Verde ", "512gb");
                    dispositivoMovil.mostrar();
                    do {
                        System.out.println("¿ Que tipo de Dispositivo Movil le gustaria ver ?");
                        System.out.println("1. SmarthPhone");
                        System.out.println("2. Tablet");
                        System.out.println("3. Regresar al Menu Principal");
                        opcion3 = scanner.nextInt();
                        switch (opcion3) {
                            case 1:
                                SmarthPhone smarthPhone = new SmarthPhone("5.5pulg ", "74512 ");
                                smarthPhone.mostrar();
                                break;

                            case 2:
                                Tablet tablet = new Tablet(545, "100% ");
                                tablet.mostrar();
                                break;
                            case 3:
                                System.out.println("Volviendo al menu principal.........");
                        }
                    }while (opcion3 != 3);
                    break;
                case 4:
                    Electrodomestico electrodomestico = new Electrodomestico("Secadora", 2026, "Portatil", "220V");
                    electrodomestico.mostrar();
                    System.out.println("El electrodomestico Disponible es: ");
                    Refrigerador refrigerador = new Refrigerador("800C", "120V");
                    refrigerador.mostrar();
                    break;
                case 5:
                    System.out.println("Saliendo del Programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida, Intenta de Nuevo");
            }
        }
    }
}