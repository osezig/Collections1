package Transport;

import Transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", " Granta ", 1.7, Car.BodyType.SEDAN);
        Car audi = new Car("Audi ", " A8 ", 3.0, Car.BodyType.COUPE);
        Car bmw = new Car("BMW ", " Z8 ", 3.0, Car.BodyType.COUPE);
        Car kia = new Car("KIA ", " Sportage ", 2.4, Car.BodyType.CROSSOVER);

        Trucks kamaz = new Trucks("Kamaz ", " A-1 ", 5.5,
                Trucks.LoadCapacity.N3);
        Trucks man = new Trucks("Man ", " B-2 ", 4.5,
                Trucks.LoadCapacity.N2_DOWN_BOUND, Trucks.LoadCapacity.N2_UPPER_BOUND);
        Trucks volvo = new Trucks("Volvo ", " C-3 ", 5.0,
                Trucks.LoadCapacity.N1);
        Trucks reno = new Trucks("Reno ", " D-4 ", 3.5,
                Trucks.LoadCapacity.N3);

        Bus busOne = new Bus("busOne ", " A1 ", 3.0,
                Bus.CapacityType.EXTRA_SMALL);
        Bus busTwo = new Bus("busTwo ", " A2 ", 3.0,
                Bus.CapacityType.MEDIUM_DOWN_BOUND, Bus.CapacityType.MEDIUM_UPPER_BOUND);
        Bus busThree = new Bus("busThree ", " A3 ", 2.4,
                Bus.CapacityType.LARGE_DOWN_BOUND, Bus.CapacityType.LARGE_UPPER_BOUND);
        Bus busFour = new Bus("busFour ", " A4 ", 2.5,
                Bus.CapacityType.ESPECIALLY_LARGE_DOWN_BOUND, Bus.CapacityType.ESPECIALLY_LARGE_UPPER_BOUND);


        DriverCatB carDriverCatB = new DriverCatB("Петя",5, audi);
        DriverCatD busDriverCatD = new DriverCatD("Вася", 20, busOne);
        DriverCatC truckDriverCatC = new DriverCatC("Иван", 2, volvo);


        audi.setTransportType(TransportType.CAR);
        busOne.setTransportType(TransportType.BUS);
        volvo.setTransportType(TransportType.TRUCK);
        audi.printType();
        busOne.printType();
        volvo.printType();
        reno.printType();


        ArrayList<Transport> allTransports = new ArrayList<>();
        allTransports.add(lada);
        allTransports.add(audi);
        allTransports.add(bmw);
        allTransports.add(kia);
        allTransports.add(kamaz);
        allTransports.add(volvo);
        allTransports.add(busOne);
        allTransports.add(busTwo);
        allTransports.add(busThree);
        allTransports.add(busFour);

        Mechanic mechanicOne = new Mechanic("Механик Иванов", "Компания №1", TransportType.CAR);
        Mechanic mechanicTwo = new Mechanic("Механик Петров", "Компания №1", TransportType.BUS);
        Mechanic mechanicThree =new Mechanic("Механик Сидоров", "Компания №1", TransportType.TRUCK);
        Mechanic mechanicFour =new Mechanic("Механик Гриб", "Компания №2", TransportType.CAR);
        Mechanic mechanicFife =new Mechanic("Механик Дуб", "Компания №2", TransportType.TRUCK);
        Mechanic mechanicSix = new Mechanic("Механик Лось", "Компания №3", TransportType.BUS);
        Mechanic mechanicSeven =new Mechanic("Механик Контуженный", "Компания №3", TransportType.CAR);
        Mechanic mechanicEight =new Mechanic("Механик Борщ", "Компания №4", TransportType.BUS);

        lada.getMechanicArrayList().add(mechanicOne);
        lada.getMechanicArrayList().add(mechanicTwo);
        lada.getMechanicArrayList().add(mechanicThree);
        bmw.getMechanicArrayList().add(mechanicThree);
        bmw.getMechanicArrayList().add(mechanicFour);
        bmw.getMechanicArrayList().add(mechanicFife);
        bmw.getMechanicArrayList().add(mechanicSix);
        volvo.getMechanicArrayList().add(mechanicSeven);
        volvo.getMechanicArrayList().add(mechanicEight);

        Sponsor sponsorOne = new Sponsor("Спонсор Рокфеллер", 10_000_000);
        Sponsor sponsorTwo = new Sponsor("Спонсор Народ", 10_000_000);
        Sponsor sponsorThree = new Sponsor("Спонсор СтоЛото", 10_000_000);
        Sponsor sponsorFour = new Sponsor("Спонсор Рамзан", 10_000_000);
        Sponsor sponsorFife = new Sponsor("Спонсор Лелик", 10_000_000);
        Sponsor sponsorSix = new Sponsor("Спонсор Болик", 10_000_000);

        lada.getSponsorArrayList().add(sponsorOne);
        lada.getSponsorArrayList().add(sponsorTwo);
        bmw.getSponsorArrayList().add(sponsorThree);
        volvo.getSponsorArrayList().add(sponsorFour);
        kia.getSponsorArrayList().add(sponsorFife);
        kamaz.getSponsorArrayList().add(sponsorSix);

        for (Transport car :allTransports) {
            if (car.getMechanicArrayList().size() != 0) {
                System.out.println(car.getMechanicArrayList());
            }
            if (car.getSponsorArrayList().size() != 0) {
                System.out.println(car.getSponsorArrayList());
            }
        }

        ServiceStation<Transport> transportServiceStation = new ServiceStation<Transport>();
        transportServiceStation.addTransport(audi);
        transportServiceStation.addTransport(volvo);
        transportServiceStation.addTransport(kamaz);
        transportServiceStation.addTransport(busOne);
        transportServiceStation.addTransport(bmw);

        transportServiceStation.maintenance();

    }
}