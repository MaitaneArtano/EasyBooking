CREATE DATABASE EasyBooking;

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP,INDEX, REFERENCES
           ON EasyBooking.*
           TO sd@'%'
           IDENTIFIED BY 'sd';

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP,INDEX, REFERENCES
           ON EasyBooking.*
           TO sd@localhost
           IDENTIFIED BY 'sd';