package com.yes.Ahh.util;

import net.minecraftforge.energy.EnergyStorage;

public abstract class ModEnergyStorage extends EnergyStorage {
    public ModEnergyStorage(int capacity, int maxTransfer) {
        super(capacity, maxTransfer);
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int extractEnergy = super.extractEnergy(maxExtract, simulate);
        if(extractEnergy != 0) {
            onEnergyChanged();
        }

        return extractEnergy;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int recieveEnergy = super.receiveEnergy(maxReceive, simulate);
        if(recieveEnergy != 0){
            onEnergyChanged();
        }

        return recieveEnergy;
    }

    public int setEnergy(int energy){
        this.energy = energy;
        return energy;
    }

    public abstract void onEnergyChanged();
}
