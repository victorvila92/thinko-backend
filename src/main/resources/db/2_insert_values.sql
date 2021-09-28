INSERT INTO organization (name)
VALUES ('Infant Jesús');
INSERT INTO organization (name)
VALUES ('Sant Ignasi');
INSERT INTO organization (name)
VALUES ('Betania Patmos');

INSERT INTO curriculum (organization_id, cv_data)
VALUES (1, '{}');
INSERT INTO curriculum (organization_id, cv_data)
VALUES (2, '{}');
INSERT INTO curriculum (organization_id, cv_data)
VALUES (3, '{}');

INSERT INTO session_period (id, name, course, period_id, organization_id, cv_id, url)
VALUES (1, 'Ordinales', 1, 2, 1, 1, 'https://www.youtube.com/watch?v=qCfQ5OpA2U0&ab_channel=Tuescueladeespa%C3%B1ol');
INSERT INTO session_period (id, name, course, period_id, organization_id, cv_id, url)
VALUES (2, 'Ordinales y fracciones', 1, 2, 1, 1, 'https://www.youtube.com/watch?v=qCfQ5OpA2U0&ab_channel=Tuescueladeespa%C3%B1ol');
INSERT INTO session_period (id, name, course, period_id, organization_id, cv_id, url)
VALUES (3, 'Fracciones y decimales', 1, 2, 1, 1, 'https://www.youtube.com/watch?v=qCfQ5OpA2U0&ab_channel=Tuescueladeespa%C3%B1ol');
INSERT INTO session_period (id, name, course, period_id, organization_id, cv_id, url)
VALUES (4, 'Ordinales, Fracciones y Decimales', 1, 2, 1, 1, 'https://www.youtube.com/watch?v=qCfQ5OpA2U0&ab_channel=Tuescueladeespa%C3%B1ol');