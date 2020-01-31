package com.unitedremote.bootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitedremote.bootcamp.models.Rider;

public interface RiderRepository  extends JpaRepository<Rider, Long> {

}
