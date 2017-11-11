-- Put here removal of old data in existing tables (only DELETE FROM, no DROP TABLE)

TRUNCATE TABLE adress CASCADE;
TRUNCATE TABLE agecategory CASCADE;
TRUNCATE TABLE booking CASCADE;
TRUNCATE TABLE category CASCADE;
TRUNCATE TABLE customer CASCADE;
TRUNCATE TABLE partner CASCADE;
TRUNCATE TABLE partneruser CASCADE;
TRUNCATE TABLE duration CASCADE;
TRUNCATE TABLE flat CASCADE;
TRUNCATE TABLE guest CASCADE;
TRUNCATE TABLE guestequipment CASCADE;
TRUNCATE TABLE lang CASCADE;
TRUNCATE TABLE payment CASCADE;
TRUNCATE TABLE period CASCADE;
TRUNCATE TABLE periodservice CASCADE;
TRUNCATE TABLE price CASCADE;
TRUNCATE TABLE rating CASCADE;
TRUNCATE TABLE season CASCADE;
TRUNCATE TABLE service CASCADE;
TRUNCATE TABLE servicelang CASCADE;
TRUNCATE TABLE track CASCADE;
TRUNCATE TABLE adress CASCADE;
TRUNCATE TABLE user_roles CASCADE;
TRUNCATE TABLE users CASCADE;


-- Put here any data to insert for testing
INSERT INTO users(user_id, enabled, username, password) VALUES (1, TRUE, 'test', 'test');
INSERT INTO users(user_id, enabled, username, password) VALUES (2, TRUE, 'admin_sport1', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (3, TRUE, 'admin_sport2', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (4, TRUE, 'customer', 'customer');
INSERT INTO users(user_id, enabled, username, password) VALUES (5, TRUE, 'admin_pass1', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (201, TRUE, 'admin', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (202, TRUE, 'training', 'admin');

INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (2, 'ROLE_PARTNER_SPORT', 2);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (3, 'ROLE_PARTNER_SPORT', 3);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (4, 'ROLE_USER', 4);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (5, 'ROLE_PARTNER_PASS', 5);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (6, 'ROLE_ADMIN', 201);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (7, 'ROLE_PARTNER_TRAINING', 202);

INSERT INTO adress(id, adress, country, town)VALUES (1, '750 avenue des oies', 'douai', 'france');
INSERT INTO adress(id, adress, country, town)VALUES (2, '18 avenue de la marne', 'lille', 'france');
INSERT INTO adress(id, adress, country, town)VALUES (3, '1 rue du bois', 'lambersart', 'france');
INSERT INTO adress(id, adress, country, town)VALUES (4, '14 blvd du breuc', 'paris', 'france');

INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (1, to_date('1990-01-01','YYYY-MM-DD'), 'doe', null, null, 'john', 1, 1);
/* doublon avec nom et prenom pour test sur la recherche client */
INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (3, to_date('1990-01-01','YYYY-MM-DD'), 'doe', null, null, 'john', 2, null);
INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (2, to_date('1990-01-01','YYYY-MM-DD'), 'deblues', null, null, 'agathe', 3, null);
INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (4, to_date('1982-05-01','YYYY-MM-DD'), 'van varenberg', null, null, 'jean-claude', 4, null);

INSERT INTO season(id, enddate, name, startdate) VALUES (1, to_date('2013-06-30','YYYY-MM-DD'), 'AH13', to_date('2013-01-01', 'YYYY-MM-DD'));
INSERT INTO season(id, enddate, name, startdate) VALUES (2, to_date('2013-12-31','YYYY-MM-DD'), 'AH13', to_date('2013-07-01', 'YYYY-MM-DD'));

INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 1, to_date('2013-02-24', 'YYYY-MM-DD'), 'Vacances fevrier S1', to_date('2013-02-18', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 2, to_date('2013-03-03', 'YYYY-MM-DD'), 'Vacances fevrier S2', to_date('2013-02-25', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 3, to_date('2013-03-10', 'YYYY-MM-DD'), 'Vacances fevrier S3', to_date('2013-03-04', 'YYYY-MM-DD'), 1);    
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 4, to_date('2013-06-17', 'YYYY-MM-DD'), 'Vacances juin S1', to_date('2013-06-03', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 5, to_date('2013-06-30', 'YYYY-MM-DD'), 'Vacances juin S2', to_date('2013-06-18', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 6, to_date('2013-07-15', 'YYYY-MM-DD'), 'Vacances juillet S1', to_date('2013-07-01', 'YYYY-MM-DD'), 2); 
    
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (1, 80, false, 50, 100, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (2, 380, false, 120, 400, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (3, 280, false, 100, 300, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (4, 20, false, 5, 30, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (5, 18, false, 4, 20, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (6, 8, false, 3, 10, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (7, 0, false, 0, 0, 0);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (8, 0, false, 0, 900, 0);

INSERT INTO service(id, description, name) VALUES (1, 'appartement 1/4 personnes', 'appartement 1/4 personnes');
INSERT INTO service(id, description, name) VALUES (2, 'appartement 4/6 personnes', 'appartement 4/6 personnes');
INSERT INTO service(id, description, name) VALUES (10, 'appartement 6/8 personnes', 'appartement 6/8 personnes');
INSERT INTO service(id, description, name) VALUES (3, 'Ski alpin marque Jet', 'Ski');
INSERT INTO service(id, description, name) VALUES (4, 'Snowboard marque Jot', 'Snowboard');
INSERT INTO service(id, description, name) VALUES (5, 'Combinaison standard special grand froid', 'Combinaison complete');
INSERT INTO service(id, description, name) VALUES (6, 'Forfait de remontee mecanique', 'Forfait standard');
INSERT INTO service(id, description, name) VALUES (11, 'Forfait de remontee mecanique', 'Forfait demi-journee');
INSERT INTO service(id, description, name) VALUES (7, 'Option annulation', 'Annulation');
INSERT INTO service(id, description, name) VALUES (8, 'Option assurance neige', 'Assurance');
INSERT INTO service(id, description, name) VALUES (9, 'Option telesiege', 'Telesiege');

INSERT INTO partner(dtype, id, description, name) VALUES ('SportPartner', 1, 'Partenaire sport A', 'Sport & Sport');
INSERT INTO partner(dtype, id, description, name) VALUES ('SportPartner', 2, 'Partenaire sport B', 'Sport & Co');
INSERT INTO partner(dtype, id, description, name) VALUES ('MechanicPartner', 3, 'Partenaire forfait A', 'Remontee pro');
INSERT INTO partner(dtype, id, description, name) VALUES ('TrainingPartner', 4, 'Training Partner description A', 'Training Partner name B');
INSERT INTO partner(dtype, id, description, name) VALUES ('TrainingPartner', 5, 'Training Partner description A', 'Training Partner name B');

INSERT INTO partneruser(id, jobtitle, name, surname, partner_id, user_user_id) VALUES (1, 'sport job 1', 'doe', 'john', 1, 2);
INSERT INTO partneruser(id, jobtitle, name, surname, partner_id, user_user_id) VALUES (2, 'sport job 2', 'van', 'vanessa', 2, 3);
INSERT INTO partneruser(id, jobtitle, name, surname, partner_id, user_user_id) VALUES (3, 'mechanic job 1', 'doe', 'jane', 3, 5);

INSERT INTO category(id, description, name) VALUES (1, 'Materiel : ski, snowboard, etc', 'Materiel');
INSERT INTO category(id, description, name) VALUES (2, 'Equipement : combinaison, bottes etc', 'Equipement');

INSERT INTO agecategory(id, endage, name, startage) VALUES (1, 14, 'enfant', 0);
INSERT INTO agecategory(id, endage, name, startage) VALUES (2, 64, 'adulte', 15);
INSERT INTO agecategory(id, endage, name, startage) VALUES (3, 100, 'senior', 65);

INSERT INTO track(id, domain, name, type) VALUES (1, 'ToutSchuss', 'ToutSchuss standard', 'alpin');
INSERT INTO track(id, domain, name, type) VALUES (2, 'ToutSchuss', 'ToutSchuss diamant', 'alpin');
INSERT INTO track(id, domain, name, type) VALUES (3, 'ToutSchuss', 'Ski nordique', 'nordique');

INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (1, false, '1/2 jour', 0);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (2, false, '1 jour', 1);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (3, false, '2 jour', 2);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (4, false, '3 jour', 3);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (5, false, '4 jour', 4);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (6, false, '5 jour', 5);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (7, false, '6 jour', 6);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (8, false, '7 jour', 7);
INSERT INTO duration(id, fullseason, name, numberofdays) VALUES (9, true, 'saison complete', 180); 

-- Appartement 1/4 personnes
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('FlatType', 1, null, null, 'appartement composé de 2 lits', null, 
            2, 50 ,
            false, null, null, null, null, 
            1, 1, 1, null, null, 
            null, null, null,  
            null, null);

-- Appartement 4/6 personnes            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('FlatType', 2, null, null, 'appartement composé de 4 lits', null, 
            4, 70,
            false, null, null, null, null, 
            1, 2, 2, null, null, 
            null, null, null,  
            null, null);
			
-- Appartement 6/8 personnes            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('FlatType', 23, null, null, 'appartement composé de 3 lits', null, 
            3, 90,
            false, null, null, null, null, 
            1, 8, 10, null, null, 
            null, null, null,  
            null, null);

-- Ski            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Equipment', 3, null, null, 'Ski marque A', 'Ski A', 
            null, null,
            null, null, 140, 'standard', 30, 
            1, 4, 3, 2, null, 
            null, null, null, 
            1, 1);
            
-- Snowboard            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('Equipment', 4, null, null, 'Snowboard marque A', 'Snowboard A', 
            null, null,
            null, null, 160, 'standard', 15, 
            1, 3, 4, 2, null, 
            null, null, null,
            1, 1);
        
-- Combinaison            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('Equipment', 5, null, null, 'Combinaison special grand froid', 'Combinaison', 
            null, 180,
            null, null, 160, 'standard', 50, 
            1, 6, 5, 2, null, 
            null, null, null, 
            1, 1);
        
-- Forfait de remontee mecanique            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,  
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('Pass', 6, 2, false, null, null, 
            null, null,
            null, null, null, null, null, 
            1, 1, 6, 2, 8, 
            3, 1, null,
            null, null);
            
 INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Pass', 10, 2, false, null, null, 
            null, null,
            null, null, null, null, null, 
            1, 1, 6, 2, 8, 
            3, 3, null, 
            null, null);
			
 INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Pass', 24, 2, false, null, null, 
            null, null,
            null, null, null, null, null, 
            1, 1, 11, 3, 8, 
            3, 3, null, 
            null, null);
			
 INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Pass', 25, 2, false, null, null, 
            null, null,
            null, null, null, null, null, 
            1, 1, 11, 1, 8, 
            3, 3, null, 
            null, null);
            
-- Option annulation            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Option', 7, null, null, 'Permet annulation de la commande', 'annulation', 
            null, null,
            false, 20, null, null, null, 
            1, 7, 7, null, null, 
            null, null, null, 
            null, null);
            
-- Option assurance neige            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,  booking_id, 
            category_id, sportpartner_id)
    VALUES ('Option', 8, null, null, 'Permet de prendre une assurance neige', 'assurance neige', 
            null, null,
            true, null, null, null, null, 
            1, 6, 8, null, null, 
            null, null, null,  
            null, null);
            
-- Option telesiege            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id)
    VALUES ('Option', 9, null, null, null, null, 
            null, null,
            true, null, null, null, null, 
            1, 5, 9, null, null, 
            null, null, null, 
            null, null);
            
            
            
            
            
-- Training course numero 1             
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id,
            courseLevel, totalHourDuration, numberOfHalfDay, trainingpartner_id, pass_id , agecategory_id)
    VALUES ('TrainingCourse', 20, null, null, null, null, 
            null, null,
            true, null, null, null, null, 
            1, 5, 9, null, 
            null, null, null, 
            null, null,
            3, 45, 9, 4, 6, 3);  
            
            
-- Training course numero 2             
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id,
            courseLevel, totalHourDuration, numberOfHalfDay, trainingpartner_id, pass_id, agecategory_id)
    VALUES ('TrainingCourse', 21, null, null, null, null, 
            null, null,
            true, null, null, null, null, 
            1, 5, 9, null, 
            null, null, null, 
            null, null,
            2, 40, 8, null, 6, 1);             
            
            
-- Training course numero 3             
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size,
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, duration_id, 
            mechanicpartner_id, track_id, booking_id, 
            category_id, sportpartner_id,
            courseLevel, totalHourDuration, numberOfHalfDay, trainingpartner_id, pass_id, agecategory_id)
    VALUES ('TrainingCourse', 22, null, null, null, null, 
            null, null,
            true, null, null, null, null, 
            1, 5, 9, null, 
            null, null, null, 
            null, null,
            5, 60, 10, 5, 10, 2);               
            
            
            
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1, true, 1, true, 101, 'nettoye', null, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (2, true, 1, true, 102, 'nettoye', null, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (3, true, 1, true, 103, 'nettoye', null, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (4, true, 1, true, 104, 'nettoye', null, 2);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (5, true, 2, true, 201, 'nettoye', null, 2);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (6, true, 2, true, 202, 'nettoye', null, 2);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (7, true, 2, true, 203, 'nettoye', null, 2);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (8, false, 3, false, 101, 'a nettoyer', null, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (9, false, 3, true, 101, 'a nettoyer', null, 2);

-- Booking for test 

-- Booking avec dates mai 2013
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1005, true , 900,  to_date('2013-05-01','YYYY-MM-DD'), false,  to_date('2013-05-12','YYYY-MM-DD'),  to_date('2013-05-05','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1006, true , 900,  to_date('2013-05-01','YYYY-MM-DD'), false,  to_date('2013-05-19','YYYY-MM-DD'),  to_date('2013-05-12','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1007, true , 900,  to_date('2013-05-01','YYYY-MM-DD'), false,  to_date('2013-05-19','YYYY-MM-DD'),  to_date('2013-05-12','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1008, true , 900,  to_date('2013-05-01','YYYY-MM-DD'), false,  to_date('2013-05-19','YYYY-MM-DD'),  to_date('2013-05-12','YYYY-MM-DD'), 1, null);
-- Booking avec dates juin-juillet 2013
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1001, true , 900,  to_date('2013-06-01','YYYY-MM-DD'), false,  to_date('2013-06-10','YYYY-MM-DD'),  to_date('2013-06-03','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1002, true , 900,  to_date('2013-06-01','YYYY-MM-DD'), false,  to_date('2013-06-17','YYYY-MM-DD'),  to_date('2013-06-10','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1003, true , 900,  to_date('2013-06-03','YYYY-MM-DD'), false,  to_date('2013-07-15','YYYY-MM-DD'),  to_date('2013-07-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1004, true , 900,  to_date('2013-16-10','YYYY-MM-DD'), false,  to_date('2013-07-31','YYYY-MM-DD'),  to_date('2013-07-15','YYYY-MM-DD'), 1, null);

INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2000, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2013-01-08','YYYY-MM-DD'),  to_date('2013-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2001, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2014-01-08','YYYY-MM-DD'),  to_date('2014-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2002, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2015-01-08','YYYY-MM-DD'),  to_date('2015-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2003, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  to_date('2016-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2004, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  to_date('2016-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2005, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  CURRENT_DATE, 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (3000, true , 900,  to_date('2015-01-01','YYYY-MM-DD'), false,  to_date('2013-01-08','YYYY-MM-DD'),  to_date('2013-01-01','YYYY-MM-DD'), 1, null);


-- Guest for test
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (1, to_date('1970-01-01','YYYY-MM-DD'), 180, 'doe', 45, 'john', 2, 1001, 6);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (2, to_date('1974-01-15','YYYY-MM-DD'), 178, 'doe', 43, 'jane', 2, 1002, 10);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (3, to_date('1980-05-30','YYYY-MM-DD'), 190, 'dubreuil', 46, 'claire', 2, 1003, 6);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (4, to_date('1983-01-01','YYYY-MM-DD'), 174, 'dubois', 42, 'anna', 2, 1004, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (5, to_date('1978-03-01','YYYY-MM-DD'), 168, 'dufour', 43, 'jean', 2, 2003, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (6, to_date('1971-04-01','YYYY-MM-DD'), 186, 'francois', 44, 'pierre', 2, 2004, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (7, to_date('1970-08-15','YYYY-MM-DD'), 195, 'souilliart', 46, 'maxime', 2, 2005, null);

INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (8, to_date('1998-01-01','YYYY-MM-DD'), 160, 'demestre', 36, 'anne', 1, 1005, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (9, to_date('2001-03-01','YYYY-MM-DD'), 151, 'koubal', 34, 'kevin', 1, 1006, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (10, to_date('2003-04-01','YYYY-MM-DD'), 150, 'adams', 36, 'jean', 1, 1007, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (11, to_date('2005-08-15','YYYY-MM-DD'), 143, 'brunois', 32, 'patrick', 1, 1008, null);

-- GuestEquipment for test
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (1, null, null, false, 3, 1);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (2, null, null, false, 3, 2);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (3, null, null, false, 5, 2);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (4, null, null, false, 3, 3);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (5, null, null, false, 3, 4);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (6, null, null, false, 3, 5);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (7, null, null, false, 5, 5);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (8, null, null, false, 3, 6);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (9, null, null, false, 3, 7);
INSERT INTO guestequipment(id, leasedate, returndate, returnstateaccepted, equipment_id, guest_id) VALUES (10, null, null, false, 5, 7);



-- Payment for test 
INSERT INTO payment(dtype, id, paymentdate, authorized, cardnumber, expirationdate, type, booking_id) VALUES ('PaymentCredit', 1000, null, true, null, null, 'Visa', null);
INSERT INTO payment(dtype, id, paymentdate, authorized, cardnumber, expirationdate, type, booking_id) VALUES ('PaymentCredit', 1001, null, false, null, null, 'Master Card', null);

-- Rating for test 
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1000, '1) Ce site est bien organisé', '2013-02-01', 3, 1, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1001, '2) Bonnes informations sur vos differents services', '2013-02-08', 1, 2, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1002, '3) La location du logement a été effectué sans soucis', '2013-03-10', 3, 1, 1);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1003, '4) Appartement agréable, bon séjour', '2013-03-10', 3, 2, 1);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1004, '5) Appartement nettoyé à notre arrivé, bon séjour', '2013-06-01', 2, 4, 2);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1005, '6) bon séjour', '2013-06-10', 2, 1, 2);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1006, '7) Appartement pour bon séjour familial', '2013-06-10', 3, 2, 10);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1007, '8) Appartement agréable', '2013-06-10', 3, 4, 10);