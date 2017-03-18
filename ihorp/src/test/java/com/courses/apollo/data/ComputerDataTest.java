package com.courses.apollo.data;

import com.courses.apollo.model.computer.*;

import java.util.ArrayList;

/**
 * Created by User on 18.03.2017.
 */
public class ComputerDataTest {
    public ComputerDataTest(){}

    public static Computer getComputer() {

        HardDiskDrive hdd1 = new HardDiskDrive();
        hdd1.setNameHdd("Hitachi");
        hdd1.setCapacityHdd(1000);
        hdd1.setFormFactorHdd(2.5);
        hdd1.setInterfaceHdd("SATA3");
        hdd1.setHasViruses(true);

        HardDiskDrive hdd2 = new HardDiskDrive();
        hdd2.setNameHdd("Toshiba");
        hdd2.setCapacityHdd(500);
        hdd2.setFormFactorHdd(2.5);
        hdd2.setInterfaceHdd("SATA2");
        hdd2.setHasViruses(false);

        ArrayList<HardDiskDrive> hdd = new ArrayList<HardDiskDrive>();
        hdd.add(hdd1);
        hdd.add(hdd2);

        DvdRom dvd = new DvdRom();
        dvd.setNameDvdRom("Samsung");
        dvd.setDvdWriting(true);
        dvd.setSpeedDvdRom("16x");

        Ram ram = new Ram();
        ram.setNameRam("GoodRam");
        ram.setCapacityRam(8);
        ram.setSpeedRam(2333);
        ram.setTypeRam("DDR4");

        Cpu cpu = new Cpu();
        cpu.setNameCpu("Intel");
        cpu.setFrequencyCpu(2400);
        cpu.setLithographyCpu(14);
        cpu.setTdpCpu(15);

        Computer computer = new Computer();
        computer.setComputerName("MacAir");
        computer.setConditionComputer(true);
        computer.setHardDiskDrives(hdd);
        computer.setDvdRom(dvd);
        computer.setRam(ram);
        computer.setCpu(cpu);

        return computer;
    }
}
