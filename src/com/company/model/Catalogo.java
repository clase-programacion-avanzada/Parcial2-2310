package com.company.model;

import java.util.*;

public class Catalogo {

    List<Robot> catalogoDeRobots;

    public Catalogo() {
        this.catalogoDeRobots = new ArrayList<>();
    }

    public Robot buscarRobotPorCodigo(String codigo) {


        Robot robotFunctional = catalogoDeRobots.stream()
                .filter(robot -> robot.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);


        for (Robot robot : catalogoDeRobots) {
            boolean esCodigoBuscado = robot.getCodigo().equals(codigo);
            if (esCodigoBuscado) {
                return robot;
            }

        }

        return null;

    }

    public void agregarRobotAlCatalogo(String codigo, double pesoMaximo) {


        boolean robotYaexiste = buscarRobotPorCodigo(codigo) != null;

        if (robotYaexiste) {
            throw new IllegalArgumentException("Este robot ya existe en el catalogo");
        }

        Robot robot = new Robot(codigo,pesoMaximo);

        this.catalogoDeRobots.add(robot);

    }

    public void agregarComponenteARobot (String codigoRobot,
                                         int id,
                                         String nombre,
                                         double peso) {

        Robot robot = buscarRobotPorCodigo(codigoRobot);

        boolean robotNoExiste = robot == null;

        if (robotNoExiste) {
            throw new IllegalArgumentException("Robot no existe");
        }

        robot.agregarComponente(id,nombre,peso);

    }

    public boolean eliminarRobot (String codigoRobot) {

        Robot robot = buscarRobotPorCodigo(codigoRobot);

        boolean robotNoExiste = robot == null;

        if (robotNoExiste) {
            throw new IllegalArgumentException("Robot no existe");
        }

        return catalogoDeRobots.remove(robot);

    }

    public List<String> nombreDeComponentesUsados(){

        /*Forma 1*/
        List<String> nombreDeComponentesConValoresRepetidos =
                new ArrayList<>();

        for (Robot r : catalogoDeRobots) {
            List<Componente> componentes =
                    r.getComponentes();
            for (Componente c : componentes) {
                nombreDeComponentesConValoresRepetidos.add(c.getNombre());
            }
        }



        List<String> nombresDeComponentesSinDuplicados =
                nombreDeComponentesConValoresRepetidos.stream()
                        .distinct()
                        .toList();

        /*Forma 2*/
        List <String> alternativa = catalogoDeRobots.stream()
                .map(robot -> robot.getComponentes())
                .flatMap(List::stream)
                .map(componente -> componente.getNombre())
                .distinct()
                .toList();

        /*Forma 3*/
        Set<String> nombresSinDuplicados = new HashSet<>();

        for (Robot r : catalogoDeRobots) {
            List<Componente> componentes =
                    r.getComponentes();
            for (Componente c : componentes) {
                nombresSinDuplicados.add(c.getNombre());
            }
        }

        List<String> listaDelSet = new ArrayList<>(nombresSinDuplicados);


        return nombresDeComponentesSinDuplicados;
    }
}
