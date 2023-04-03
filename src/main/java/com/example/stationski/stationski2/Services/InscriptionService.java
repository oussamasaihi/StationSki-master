package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Inscription;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class InscriptionService implements IInscriptionService {

    @Override
    public List<Inscription> findAll() {
        return null;
    }

    @Override
    public List<Inscription> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Inscription> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Inscription> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Inscription entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Inscription> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Inscription> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Inscription> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Inscription> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Inscription> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Inscription> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Inscription> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Inscription getOne(Long aLong) {
        return null;
    }

    @Override
    public Inscription getById(Long aLong) {
        return null;
    }

    @Override
    public Inscription getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Inscription> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Inscription> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Inscription> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Inscription> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Inscription> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Inscription> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Inscription, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
