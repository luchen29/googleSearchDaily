INSERT INTO user (id, username, password, firstname, lastname, email, enabled, lastpasswordresetdate) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, '2016-01-01');
INSERT INTO user (id, username, password, firstname, lastname, email, enabled, lastpasswordresetdate) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, '2016-01-01');
INSERT INTO user (id, username, password, firstname, lastname, email, enabled, lastpasswordresetdate) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, '2016-01-01');

INSERT INTO role (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO role (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (3, 1);

--"news" table schema:
--Id int NOT NULL PRIMARY KEY,
--Title varchar(255) NOT NULL,
--NewsUrl varchar(255) NOT NULL,
--Content text NOT NULL,
--DatePublished dateTime NOT NULL,
--NewsProviderName varchar(200),
--Category varchar(100) NOT NULL,
--ImgUrl varchar(255),
--ImgWidth int,
--ImgHeight int,
--ImgProviderName varchar(200),
--IsBreakingNews boolean,

--create table news (id int not null auto_increment, title varchar(255) not null, newsUrl varchar(255) not null, content text not null, datePublished dateTime not null, newsProviderName varchar(200), category varchar(100) not null, imgUrl varchar(200), imgWidth int, imgHeight int, imgProviderName varchar(200), isBreakingNews boolean, primary key (id));
--INSERT INTO news (id, title, news_url, content, date_published, news_provider_name, category, img_url, img_width, img_height, img_provider_name, is_breaking_news) VALUES (1, 'test title', 'www.google.com', 'This is a test message. 
--   This is a test message. This is a test message. This is a test message.This is a test message.', '2019-01-01', 'google', 'test category', 'www.google.com', 400, 300, 'google', true);

INSERT INTO news (id, title, news_url, content, date_published, news_provider_name, category, img_url, img_width, img_height, img_provider_name, is_breaking_news) VALUES (1, 'test title', 'www.google.com', 'This is a test message. This is a test message. This is a test message. This is a test message.This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message. This is a test message.', '2019-01-01', 'google', 'test category', 'www.google.com', 400, 300, 'google', true);
