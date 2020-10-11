package kz.mels.pizzacatalog.service;

import kz.mels.pizzacatalog.model.Pizza;
import kz.mels.pizzacatalog.model.PizzaCatalog;

import java.util.List;

public interface PizzaInfoService {

    List<Pizza> getUserPizza();
    Pizza getPizza(Long id);
}
