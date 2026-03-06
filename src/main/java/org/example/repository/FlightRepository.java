package org.example.repository;

import org.example.model.Flight;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightRepository {


    private SessionFactory sessionFactory;

    public FlightRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Flight> findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode(String departureDate, String departureAirportCode, String arrivalAirportCode) {
        try (Session session = sessionFactory.openSession()) {
            String queryStr = "SELECT * FROM Flight f WHERE f.departureDate = :departureDate AND f.departureAirport.code = :departureAirportCode AND f.arrivalAirport.code = :arrivalAirportCode";
            Query<Flight> query = session.createQuery(queryStr, Flight.class);
            query.setParameter("departureDate", departureDate);
            query.setParameter("departureAirportCode", departureAirportCode);
            query.setParameter("arrivalAirportCode", arrivalAirportCode);
            return query.list();
        }
    }

    public Flight findById(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Flight.class, id);
        }
    }

    public void save(Flight flight) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(flight);
        }
    }

}

