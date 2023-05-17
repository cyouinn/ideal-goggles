package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Keisann;

@Repository
public interface KeisannReository extends CrudRepository<Keisann, Long> {
    List<Keisann> findByBody(String body);
    List<Keisann> findByResult(int result);
}