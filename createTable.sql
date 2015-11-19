CREATE TABLE role (
  id INT PRIMARY KEY,
  name TEXT NOT NULL
);

CREATE table user_info (
  id SERIAL PRIMARY KEY,
  name TEXT not null,
  role INT REFERENCES role(id)
);

INSERT INTO role (id, name) VALUES (1, 'admin');
INSERT INTO role (id, name) VALUES (2, 'user');

INSERT INTO user_info (name, role) VALUES ('adminUser', 1);
INSERT INTO user_info (name, role) VALUES ('standardUser1', 2);
INSERT INTO user_info (name, role) VALUES ('standardUser2', 2);
INSERT INTO user_info (name, role) VALUES ('standardUser3', 2);
