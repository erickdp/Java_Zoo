/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoolomania.funcional.control;

import com.zoolomania.funcional.modelo.Continente;
import com.zoolomania.funcional.modelo.Cuidador;
import com.zoolomania.funcional.modelo.Especie;
import com.zoolomania.funcional.modelo.Guia;
import com.zoolomania.funcional.modelo.Habitat;
import com.zoolomania.funcional.modelo.Itinerario;
import com.zoolomania.funcional.modelo.Zona;
import java.util.List;

/**
 * Clase que contiene las operaciones utilitarias de gestión (Eliminación 
 * profunda de objetos)
 * @author Erick Díaz
 */
public class UtilGestion {

    private static ZonaTrs ztrs = new ZonaTrs();
    private static EspecieTrs etrs = new EspecieTrs();
    private static ItinerarioTrs itrs = new ItinerarioTrs();
    private static GuiaTrs gtrs = new GuiaTrs();
    private static HabitatTrs htrs = new HabitatTrs();
    private static CuidadorTrs ctrs = new CuidadorTrs();
    private static ContinenteTrs cctrs = new ContinenteTrs();
    private static List<Zona> zonas;
    private static List<Especie> especies;
    private static List<Guia> guias;
    private static List<Habitat> habitats;
    private static List<Itinerario> itinerarios;
    private static List<Cuidador> cuidadores;
    private static List<Continente> continentes;

    static {
        zonas = ztrs.listar();
        especies = etrs.listar();
        guias = gtrs.listar();
        habitats = htrs.listar();
        itinerarios = itrs.listar();
        cuidadores = ctrs.listar();
        continentes = cctrs.listar();
    }

    /**
     * Método que permite buscar en las listas de los objetos existentes si esque 
     * el objeto pasado como argumento los contiene, para eliminarlo de estas.
     * @param registro
     * @throws MyExcepcion 
     */
    public static void eliminacionCompleta(Object registro) throws MyExcepcion {
        if (registro instanceof Especie) { // Eliminar de Cuidador, Habitat y Zona
            for (Cuidador c : cuidadores) {
                if (c.getEspecies().contains(registro)) {
                    c.getEspecies().remove(registro);
                    ctrs.actulizar(c);
                }
            }
            for (Zona z : zonas) {
                if (z.getEspecies().contains(registro)) {
                    z.getEspecies().remove(registro);
                    ztrs.actulizar(z);
                }

            }
            for (Habitat h : habitats) {
                if (h.getEspecies().contains(registro)) {
                    h.getEspecies().remove(registro);
                    htrs.actulizar(h);
                }
            }
        } else if (registro instanceof Cuidador) { // Eliminar de Especie
            for (Especie e : especies) {
                if (e.getCuiadores().contains(registro)) {
                    e.getCuiadores().remove(registro);
                    etrs.actulizar(e);
                }
            }
        } else if (registro instanceof Zona) { // Eliminar de Especie e Itinerario
            for (Especie e : especies) {
                if (e.getZonas().contains(registro)) {
                    e.getZonas().remove(registro);
                    etrs.actulizar(e);
                }
            }
            for (Itinerario i : itinerarios) {
                if (i.getZonas().contains(registro)) {
                    i.getZonas().remove(registro);
                    itrs.actulizar(i);
                }
            }
        } else if (registro instanceof Habitat) { //Eliminar Especie
            for (Especie e : especies) {
                if (e.getHabitats().contains(registro)) {
                    e.getHabitats().remove(registro);
                    etrs.actulizar(e);
                }
            }
            for (Continente c : continentes) {
                if (c.getHabitats().contains(registro)) {
                    c.getHabitats().remove(registro);
                    cctrs.actulizar(c);
                }
            }
        } else if (registro instanceof Itinerario) { //Eliminar Zona y Guia
            for (Zona z : zonas) {
                if (z.getItinerarios().contains(registro)) {
                    z.getItinerarios().remove(registro);
                    ztrs.actulizar(z);
                }
            }
            for (Guia g : guias) {
                if (g.getItinerarios().contains(registro)) {
                    g.getItinerarios().remove(registro);
                    gtrs.actulizar(g);
                }
            }
        } else if (registro instanceof Guia) { // Eliminar Itinerario
            for (Itinerario i : itinerarios) {
                if (i.getGuias().contains(registro)) {
                    i.getGuias().remove(registro);
                    itrs.actulizar(i);
                }
            }
        } else if (registro instanceof Continente) {
            for (Habitat h : habitats) {
                if (h.getContinentes().contains(registro)) {
                    h.getContinentes().remove(registro);
                    htrs.actulizar(h);
                }
            }
        } else {
            throw new MyExcepcion();
        }
    }

}
