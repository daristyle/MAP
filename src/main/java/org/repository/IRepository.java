package org.repository;

import org.domain.IVehicle;

public interface IRepository {
    public IVehicle[] getAll();
    public void add(IVehicle vehicle);
    public void remove(Integer id);
}
