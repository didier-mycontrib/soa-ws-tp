
DROP TABLE IF EXISTS T_CURRENCY;

CREATE TABLE  T_CURRENCY (code VARCHAR(8) NOT NULL PRIMARY KEY, 
                         name VARCHAR(255), 
                         exchange_rate DOUBLE );
                                        
INSERT INTO T_CURRENCY(code,name,exchange_rate)  VALUES ('USD','dollar',1.0);
INSERT INTO T_CURRENCY(code,name,exchange_rate)  VALUES ('EUR','euro',0.87719);
INSERT INTO T_CURRENCY(code,name,exchange_rate)  VALUES ('GBP','livre',0.69961);
INSERT INTO T_CURRENCY(code,name,exchange_rate)  VALUES ('JPY','yen',112.203);  

show tables;
select * from T_CURRENCY;

