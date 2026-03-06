package org.example.repository;

import org.example.model.Airport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

@Component
public class AirportRepository {
    private SessionFactory sessionFactory;

    public AirportRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    public Airport findByAirportCode(String airportCode) {
        try (Session session = sessionFactory.openSession()) {
            Query<Airport> query = session.createQuery("FROM Airport WHERE airportCode = :airportCode", Airport.class);
            query.setParameter("airportCode", airportCode);
            return query.uniqueResult(); 
        }
    }
}