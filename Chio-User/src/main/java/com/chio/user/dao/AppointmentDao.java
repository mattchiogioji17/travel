package com.chio.user.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chio.user.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
