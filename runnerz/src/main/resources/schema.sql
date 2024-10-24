create table IF NOT EXISTS Run (
    id INT NOT NULL,
    title varchar(256) NOT NULL,
    start_on timestamp NOT NULL,
    end_on timestamp NOT NULL,
    miles INT NOT NULL,
    location varchar(10) NOT NULL,
    PRIMARY KEY (id)
);