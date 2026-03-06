package org.example.repository;

import org.example.model.Reservation;  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class ReservationRepository {
    private SessionFactory sessionFactory;

    public ReservationRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;  
    }

    public void save(Reservation reservation) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(reservation);
            session.getTransaction().commit();
        }
    } 
}

