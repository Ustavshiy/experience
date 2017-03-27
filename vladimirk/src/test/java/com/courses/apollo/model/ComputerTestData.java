package com.courses.apollo.model;

import com.courses.apollo.model.computer.*;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by vladimirk on 23.03.17.
 */
public class ComputerTestData {

    public static List<Memory> getMemoriesArrayList() {
        Memory hdd = new HDD(262144);
        Memory hdd2 = new HDD(1024000);
        Memory odd = new ODD(4812);
        Memory ram = new RAM(8192);
        Memory ram2 = new RAM(8192);
        List<Memory> memories = new ArrayList<>();
        memories.add(hdd);
        memories.add(hdd2);
        memories.add(odd);
        memories.add(ram);
        memories.add(ram2);
        return memories;
    }

    public static Computer getComputer() {
        List<Memory> inMemory = getMemoriesArrayList();
        CPU cpu = new CPU();
        Computer computer = new Computer(inMemory, cpu, false, false);
        return computer;
    }

    public static Computer getOnnComputer() {
        List<Memory> inMemory = getMemoriesArrayList();
        CPU cpu = new CPU();
        Computer computer = new Computer(inMemory, cpu, true, true);
        return computer;
    }
}
