CREATE TABLE airport (airport_code VARCHAR(3) PRIMARY KEY, airport_name VARCHAR(50), airport_city VARCHAR(50), airport_locale VARCHAR(50));


insert into airport (airport_code, airport_name, airport_city, airport_locale) VALUES ('LHR', 'London Heathrow', 'London', 'United Kingdom');
insert into airport (airport_code, airport_name, airport_city, airport_locale) VALUES ('MIA', 'Miami International', 'Miami', 'United States');
insert into airport (airport_code, airport_name, airport_city, airport_locale) VALUES ('CDG', 'Paris Charles De Gaulle', 'Paris', 'France');
insert into airport (airport_code, airport_name, airport_city, airport_locale) VALUES ('LAX', 'Los Angeles International', 'Los Angeles', 'United States');


CREATE TABLE flight (id INT PRIMARY KEY, departure_date DATE, departure_time TIME, departure_airport_code VARCHAR(3) REFERENCES airport(airport_code), arrival_date DATE, arrival_time TIME, arrival_airport_code VARCHAR(3) REFERENCES airport(airport_code), flight_number VARCHAR(10), flight_duration INT, ticket_price DECIMAL, ticket_currency VARCHAR(3), seat_capacity INT, seat_available INT);


insert into flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available) VALUES (1, '2023-08-01', '10:00', 'MIA', '2023-08-01', '14:00', 'LAX', 'MIA-LAX-1', 120, 150.00, 'USD', 100, 100);
insert into flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available) VALUES (2, '2023-08-01', '14:00', 'MIA', '2023-08-01', '14:00', 'LAX', 'MIA-LAX-2', 120, 150.00, 'USD', 100, 100);
insert into flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available) VALUES (3, '2023-08-01', '15:00', 'LHR', '2023-08-01', '17:00', 'CDG', 'LHR-CDG-1', 120, 150.00, 'USD', 100, 100);
insert into flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available) VALUES (4, '2023-08-01', '17:00', 'LHR', '2023-08-01', '17:00', 'CDG', 'LHR-CDG-2', 120, 150.00, 'USD', 100, 100);
insert into flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available) VALUES (5, '2023-08-02', '16:00', 'LHR', '2023-08-02', '16:00', 'CDG', 'LHR-CDG-3', 120, 150.00, 'USD', 100, 100);