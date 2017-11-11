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
TRUNCATE TABLE user_roles CASCADE;
TRUNCATE TABLE users CASCADE;

-- Put here any data to insert for testing
INSERT INTO users(user_id, enabled, username, password) VALUES (1, TRUE, 'test', 'test');
INSERT INTO users(user_id, enabled, username, password) VALUES (2, TRUE, 'admin_sport1', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (3, TRUE, 'admin_sport2', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (4, TRUE, 'customer', 'customer');
INSERT INTO users(user_id, enabled, username, password) VALUES (5, TRUE, 'admin_pass1', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (100, TRUE, 'tarik', '123456');
INSERT INTO users(user_id, enabled, username, password) VALUES (200, TRUE, 'usernametestjunit', 'passwordtestjunit');
INSERT INTO users(user_id, enabled, username, password) VALUES (201, TRUE, 'admin', 'admin');
INSERT INTO users(user_id, enabled, username, password) VALUES (202, TRUE, 'training', 'admin');

INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (1, 'ROLE_USER', 100);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (2, 'ROLE_PARTNER_SPORT', 2);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (3, 'ROLE_PARTNER_SPORT', 3);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (4, 'ROLE_USER', 4);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (5, 'ROLE_PARTNER_PASS', 5);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (6, 'ROLE_ADMIN', 201);
INSERT INTO user_roles(user_role_id, authority, user_id) VALUES (7, 'ROLE_PARTNER_TRAINING', 202);

INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (1, to_date('1990-01-01','YYYY-MM-DD'), 'john', null, null, 'doe', null, 1);
INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (2, to_date('1990-01-01','YYYY-MM-DD'), 'agathe', null, null, 'deblues', null, null);
INSERT INTO customer(id, dateofbirth, name, photo, profile, surname, adress_id, user_user_id) VALUES (100, to_date('1990-01-01','YYYY-MM-DD'), 'tarikcustomer', null, null, 'tarikcustomer', null, 100);

INSERT INTO season(id, enddate, name, startdate) VALUES (1, to_date('2013-06-30','YYYY-MM-DD'), 'AH13', to_date('2013-01-01', 'YYYY-MM-DD'));

INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 1, to_date('2013-02-24', 'YYYY-MM-DD'), 'Vacances fevrier S1', to_date('2013-02-18', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 2, to_date('2013-03-03', 'YYYY-MM-DD'), 'Vacances fevrier S2', to_date('2013-02-25', 'YYYY-MM-DD'), 1);
INSERT INTO period(dtype, id, enddate, name, startdate, season_id) VALUES ('HolidayPeriod', 3, to_date('2013-03-10', 'YYYY-MM-DD'), 'Vacances fevrier S3', to_date('2013-03-04', 'YYYY-MM-DD'), 1);    
    
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (1, 80, false, 50, 100, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (2, 380, false, 120, 400, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (3, 280, false, 100, 300, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (4, 20, false, 5, 30, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (5, 18, false, 4, 20, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (6, 8, false, 3, 10, 20);
INSERT INTO price(id, discountprice, discounted, margin, price, taxrate) VALUES (7, 0, false, 0, 0, 0);

INSERT INTO service(id, description, name) VALUES (1, 'appartement 4/6 personnes', 'appartement 4/6 personnes');
INSERT INTO service(id, description, name) VALUES (2, 'appartement 3/4 personnes', 'appartement 3/4 personnes');
INSERT INTO service(id, description, name) VALUES (3, 'Ski alpin marque Jet', 'Ski');
INSERT INTO service(id, description, name) VALUES (4, 'Snowboard marque Jot', 'Snowboard');
INSERT INTO service(id, description, name) VALUES (5, 'Combinaison standard special grand froid', 'Combinaison complete');
INSERT INTO service(id, description, name) VALUES (6, 'Forfait de remontee mecanique', 'Forfait standard');
INSERT INTO service(id, description, name) VALUES (7, 'Option annulation', 'Annulation');
INSERT INTO service(id, description, name) VALUES (8, 'Option assurance neige', 'Assurance');
INSERT INTO service(id, description, name) VALUES (9, 'Option telesiege', 'Telesiege');
INSERT INTO service(id, description, name) VALUES (10, 'Cours partner training', 'Cours ski');


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

-- Appartement 4/6 personnes
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('FlatType', 1, null, null, 'flat type description one', null, 
            4, 70 ,
            false, null, null, null, null, 
            1, 1, 1, null, null, 
            null, null, null,  
            null, null);

-- Appartement 3/4 personnes            
INSERT INTO periodservice(
            dtype, id, cautionprice, cautionreturned, description, name, 
            numberofbeds, size, 
            perperson, pricepercentage, minimumheight, quality, stockquantity, 
            period_id, price_id, service_id, agecategory_id, duration_id, 
            mechanicpartner_id, track_id,booking_id, 
            category_id, sportpartner_id)
    VALUES ('FlatType', 2, null, null, 'flat type description two', null, 
            2, 50,
            false, null, null, null, null, 
            1, 2, 2, null, null, 
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
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1001, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2015-01-01','YYYY-MM-DD'),  to_date('2005-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1002, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2002-01-01','YYYY-MM-DD'),  to_date('2001-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1003, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2025-01-01','YYYY-MM-DD'),  to_date('1990-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (1004, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2025-01-01','YYYY-MM-DD'),  to_date('1990-01-01','YYYY-MM-DD'), 1, null);

INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2000, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2013-01-08','YYYY-MM-DD'),  to_date('2013-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2001, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2014-01-08','YYYY-MM-DD'),  to_date('2014-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2002, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2015-01-08','YYYY-MM-DD'),  to_date('2015-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2003, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  to_date('2016-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2004, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  to_date('2016-01-01','YYYY-MM-DD'), 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2005, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2016-01-08','YYYY-MM-DD'),  CURRENT_DATE, 1, null);
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (3000, true , 900,  to_date('2015-01-01','YYYY-MM-DD'), false,  to_date('2013-01-08','YYYY-MM-DD'),  to_date('2013-01-01','YYYY-MM-DD'), 1, null);


-- Data set for cancellation integration test
INSERT INTO booking(id, advancepaid, amountpaid, bookingdate, canceled, enddate, startdate, customer_id, flat_id) VALUES (2006, true , 900,  to_date('1990-01-01','YYYY-MM-DD'), false,  to_date('2015-01-01','YYYY-MM-DD'),  to_date('2300-01-01','YYYY-MM-DD'), 100, null);

-- Guest for test
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (1, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestA', 2, 2000, 6);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (2, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestA', 2, 2001, 10);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (3, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestA', 2, 2002, 6);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (4, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestB', 2, 2002, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (5, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestA', 2, 2003, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (6, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestC', 2, 2004, null);
INSERT INTO guest(id, dateofbirth, height, name, shoessize, surname, agecategory_id, booking_id, pass_id) VALUES (7, to_date('1970-01-01','YYYY-MM-DD'), 180, 'guest', 43, 'guestC', 2, 2005, null);

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

-- Flat for test 
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1000, false, 3, true, 101, 'test', null, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1001, false, 3, true, 101, 'test', 1001, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1002, false, 3, true, 101, 'test', 1002, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1003, false, 3, true, 101, 'test', 1003, 1);
INSERT INTO flat(id, avalaible, floor, handicapaccess, roomnumber, status, booking_id, flattype_id) VALUES (1004, true, 3, true, 101, 'test', 1004, 1);

-- Payment for test 
INSERT INTO payment(dtype, id, paymentdate, authorized, cardnumber, expirationdate, type, booking_id) VALUES ('PaymentCredit', 1000, null, true, null, null, 'Visa', null);
INSERT INTO payment(dtype, id, paymentdate, authorized, cardnumber, expirationdate, type, booking_id) VALUES ('PaymentCredit', 1001, null, false, null, null, 'Master Card', null);

-- Rating for test 
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1000, '1) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 3, 1, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1001, '2) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 1, 2, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1002, '3) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 2, 2, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1003, '4) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 5, 2, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1004, '5) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 5, 2, null);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1005, '6) Ceci est un commentaires pour un rating sans service ', '2013-02-01', 4, 1, null);

INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1006, 'Ceci est un commentaires pour un rating 1 lie a un service', '2013-02-01', 3, 1, 1);
INSERT INTO rating (id, comment, date, notation, customer_id, service_id) VALUES (1007, 'Ceci est un commentaires pour un rating 2 lie a un service', '2013-02-01', 3, 2, 1);