package org.example.repository;

import org.example.model.Passenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PassengerRepository {

    private SessionFactory sessionFactory;
    
    public PassengerRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Passenger save(Passenger passenger) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(passenger);
            session.getTransaction().commit();
            return passenger;
        }
    }
}
