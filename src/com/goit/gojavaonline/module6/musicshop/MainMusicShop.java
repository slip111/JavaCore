package com.goit.gojavaonline.module6.musicshop;


import java.util.*;

public class MainMusicShop {
    public static void main(String[] args) {
        //public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
        // в заказе  (Map<String, Integer> order)
        //Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
        /*После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
        В случае, когда количество запрашиваемых инструментов определенного типа больше,
        чем количество доступных инструментов в магазине, должно быть брошено исключение.
         Выбрать наиболее подходящее из доступных в стандартной библиотеке исключений
        */

        List<Map<String, Integer>> prepareInstruments = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> storage = new HashMap<String, Integer>();
        storage.put("piano", 28);
        storage.put("guitar", 50);
        storage.put("horn",40);
        prepareInstruments.add(storage);

        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("piano",24);
        order.put("guitar",45);
        order.put("horn",32);
        prepareInstruments.add(order);
        for (Map<String, Integer> n : prepareInstruments) {
            System.out.println(n);
        }

        Guitar storageGuitar= new Guitar("Гитара", "Бас-гитара", 50);
        Piano storagePiano = new Piano("Пианино","Рояль",28);
        Horn storageHorn = new Horn("Труба","Тромбон",40);
        System.out.println();
        System.out.println(storageGuitar.getInstrumentName()+" "+storageGuitar.getGuitarType()+" "+storageGuitar.getGuitarStorageQuantity());
        System.out.println(storagePiano.getInstrumentName()+" "+storagePiano.getPianoType()+" "+storagePiano.getPianoStorageQuantity());
        System.out.println(storageHorn.getInstrumentName()+" "+" "+storageHorn.getHornType()+" "+storageHorn.getHornStorageQuantity());
        
        


     //   Set<String> strings = order.keySet();

     //   public List<Instrument> prepareInstruments(Map<String, Integer> order); {

     //   }

     //   for(String k : strings){
     //       System.out.println(k +" " + order.values());
     //   }

    }

}
